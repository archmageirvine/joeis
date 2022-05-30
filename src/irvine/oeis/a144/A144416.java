package irvine.oeis.a144;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A144416 a(n) is the total number of partitions of [1, 2, ..., k] into exactly n blocks, each of size 1, 2 or 3, for 0 &lt;= k &lt;= 3n.
 * @author Georg Fischer
 */
public class A144416 implements Sequence {

  private int mN;
  private int mParm;

  /** Construct the sequence. */
  public A144416() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param parm number of stolen gifts + 1
   */
  public A144416(final int parm) {
    mN = -1;
    mParm = parm + 1;
  }

  /* Maple:
    with(combinat):
    b:= proc(n, i, t) option remember; `if`(t*i<n, 0,
      `if`(n=0, `if`(t=0, 1, 0), add(b(n-i*j, i-1, t-j)*
       multinomial(n, n-i*j, i$j)/j!, j=0..min(t, n/i))))
    end:
    a:= n-> add(b(k, 7, n), k=0..7*n):
    seq(a(n), n=0..12);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (t * i < n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return t == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int jmax = t < ni ? t : ni;
      for (int j = 0; j <= jmax; ++j) {
        final int[] list = new int[j + 1];
        list[0] = n - i * j;
        for (int l = 1; l <= j; ++l) {
          list[l] = i;
        }
        sum = sum.add(get(n - i * j, i - 1, t - j).multiply(Binomial.multinomial(n, list)).divide(MemoryFactorial.SINGLETON.factorial(j)));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final int kmax = mParm * mN;
    for (int k = 0; k <= kmax; ++k) {
      sum = sum.add(mB.get(k, mParm, mN));
    }
    return sum;
  }
}
