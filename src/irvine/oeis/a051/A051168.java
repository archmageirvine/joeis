package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A051168 Triangular array T(h,k) for 0 &lt;= k &lt;= h read by rows: T(h,k) = number of binary Lyndon words with k ones and h-k zeros.
 * @author Sean A. Irvine
 */
public class A051168 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  protected Z t(final long n, final long k) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(LongUtils.gcd(n, k)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(n / d, k / d).multiply(Mobius.mobius(d)));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
