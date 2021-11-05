package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052307 Triangle read by rows: T(n,k) = number of bracelets (reversible necklaces) with n beads, k of which are black and n - k are white.
 * @author Sean A. Irvine
 */
public class A052307 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0 || mM == mN) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long dd = d.longValue();
      sum = sum.add(Euler.phi(d).multiply(Binomial.binomial(mN / dd - 1, mM / dd - 1)));
    }
    return sum.divide(mM).add(Binomial.binomial((mN - (mM & 1)) / 2, mM / 2)).divide2();
  }
}
