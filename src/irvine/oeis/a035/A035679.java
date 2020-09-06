package irvine.oeis.a035;
// manually from contrib/a035679.pl 2020-09-06

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035679 Number of partitions of n into parts 8k+1 and 8k+2 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035679 extends MemoryFunctionInt4<Z> implements Sequence {

  protected final int[] mModules; // which combination of elements to select
  protected final int mImod; // take i mod this number
  protected int mN; // index of next term
  
  /** Construct with default parameters. */
  public A035679() {
    this(1, 8, 1, 2);
  }
    
  /** 
   * Construct the sequence. 
   * @param offset index of first term
   * @param imod take i mod this number
   * @param modules vector of valid values
   */
  public A035679(final int offset, final int imod, final int... modules) {
    mImod = imod;
    mModules = modules;
    mN = offset - 1;
  }
    
  /**
   * Recursively evaluate all partitions and accumulate information for the condition
   * @param n number to be partitioned
   * @param i nesting level
   * @param t first accumulator
   * @param s second accumulator
   * @return number of partitions of n with this condition 
   */
  @Override
  protected Z compute(final int n, final int i, final int t, final int s) {
    Z result;
    if (n == 0) {
      result = Z.valueOf(t).multiply(Z.valueOf(s));
    } else {
      if (i < 1) {
        result = Z.ZERO;
      } else {
        result = get(n, i - 1, t, s);
        final int h = i % mImod;
        if (h == mModules[0] || h == mModules[1]) {
          Z sum = Z.ZERO;
          final int limit = n / i;
          for (int j = 1; j <= limit; ++j) {
            sum = sum.add(get(n - i * j, i - 1
              , h == mModules[0] ? 1 : t
              , h == mModules[1] ? 1 : s));
          }
          result = result.add(sum);
        }
      }
    }
    return result;
  }
/* 
b:= proc(n, i, t, s) option remember; 
  `if`(n=0
      ,t*s
      , `if`(i<1
            , 0
            , b(n, i-1, t, s)
            + (h-> `if`(h in {1, 2}
                       , add(  b(n-i*j, i-1, `if`(h=1, 1, t), `if`(h=2, 1, s))
                            , j=1..n/i)
                       , 0)
              )  (irem(i, 8))
            )
      )
    end:

b:= proc(n, i, t, s) option remember; `if`(n=0, t*s, `if`(i<1, 0,
       b(n, i-1, t, s)+(h-> `if`(h in {1, 2}, add(b(n-i*j, i-1,
      `if`(h=1, 1, t), `if`(h=2, 1, s)), j=1..n/i), 0))(irem(i, 8))))
    end:
a:= n-> b(n$2, 0$2):
seq(a(n), n=1..75);
__DATA__
0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 7, 7, 10, 10, 13, 13, 16, 16, 22, 23, 30, 31, 38, 39, 46, 47, 58, 61
, 75, 78, 93, 96, 111, 114, 134, 141, 167, 176, 204, 213, 242, 251, 286, 301, 346, 365, 416
, 436, 489, 509, 570, 599, 676, 714, 802, 844, 937, 980, 1083, 1138, 1265
*/
  
  /**
   * Compute the next term of the sequence
   * @return a specific number of partitions
   */
  @Override
  public Z next() {
    ++mN;
    return get(mN, mN, 0, 0);
  }

  /**
   * Compute a number of terms for A035536
   * @param args number of terms
   */
  public static void main(final String[] args) {
    int termNo = 64;
    final A035536 seq = new A035536();
    if (args.length > 0) {
      try {
        termNo = Integer.parseInt(args[0]);
      } catch (final Exception exc) { // ignore
      }
    }
    for (int index = 0; index < termNo; ++index) {
      System.out.println(index + " " + seq.next().toString());
    }
    System.out.println(seq.size() + " parameter sets remembered");
  }
}
