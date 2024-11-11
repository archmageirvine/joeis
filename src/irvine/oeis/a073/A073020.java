package irvine.oeis.a073;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073020 Triangle of T(n,m) = number of bracelets (necklaces than can be turned over) with m white beads and (2n-m) black ones, for 1&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A073020 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(Functions.GCD.l(2L * mN, mM)).divisors()) {
      final long dd = d.longValue();
      sum = sum.add(Functions.PHI.z(d).multiply(Binomial.binomial(2L * mN / dd - 1, mM / dd - 1)));
    }
    return sum.divide(mM).add(Binomial.binomial((2L * mN - (mM & 1)) / 2, mM / 2)).divide2();
  }
}
