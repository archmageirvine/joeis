package irvine.oeis.a147;

import irvine.math.MemoryFunctionIntArray;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A147682 Late-growing permutations: number of permutations of 2 indistinguishable copies of 1..n with every partial sum &lt;= the same partial sum averaged over all permutations.
 * with every partial sum &lt;= the same partial sum averaged over all permutations.
 * @author Georg Fischer
 */
public class A147682 extends AbstractSequence {

  private int mN;
  private final Integer mCopies;

  /** Construct the sequence. */
  public A147682() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param copies number of copies
   */
  public A147682(final int offset, final int copies) {
    super(offset);
    mN = offset - 1;
    mCopies = copies;
  }

  /* Maple:
    b:= proc(l) option remember; local m, n, g;
      m, n:= nops(l), add(i, i=l);
      g:= add(i*l[i], i=1..m)-(m+1)/2*(n-1);
      print(l, 2*g, i, n);
     `if`(n<2, 1, add(`if`(l[i]>0 and i<=g,
        b(subsop(i=l[i]-1, l)), 0), i=1..m))
    end:
    a:= n-> b([2$n]):
    seq(a(n), n=1..4);  # Alois P. Heinz, Aug 16 2012
  */
  /**
   * B function.
   */
  public static final MemoryFunctionIntArray<Z> B = new MemoryFunctionIntArray<>() {
    @Override
    protected Z compute(final int[] list) {
      final int m = list.length - 1;
      long n = 0;
      for (int k = 1; k <= m; ++k) {
        n += list[k];
      }
      if (n < 2) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      long g = 0;
      for (int k = 1; k <= m; ++k) {
        g += (long) k * list[k];
      }
      final long g2 = g * 2 - (m + 1) * (n - 1);
      for (int i = 1; i <= m; ++i) {
        if (list[i] > 0 && i * 2L <= g2) {
          final int[] list2 = new int[m + 1];
          list2[0] = 0;
          for (int k = 1; k <= m; ++k) {
            list2[k] = k == i ? list[k] - 1 : list[k];
          }
          sum = sum.add(get(list2));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    final int[] list = new int[mN + 1];
    list[0] = 0;
    for (int k = 1; k <= mN; ++k) {
      list[k] = mCopies;
    }
    return B.get(list);
  }
}
