package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066032 Number of ways to write n as a product with no factor larger than m (1 &lt;= m &lt;=n, written row by row).
 * @author Sean A. Irvine
 */
public class A066032 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 1 ? Z.ONE : Z.ZERO;
      }
      if (mPrime.isPrime(n)) {
        return n <= m ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final int d = dd.intValueExact();
        if (d != 1 && d != n && d <= m) {
          sum = sum.add(get(n / d, d));
        }
      }
      if (n <= m) {
        sum = sum.add(1);
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
