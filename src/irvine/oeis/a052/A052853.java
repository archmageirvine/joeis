package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a050.A050383;

/**
 * A052851.
 * @author Sean A. Irvine
 */
public class A052853 extends A050383 {

  // todo this is not working!

  private final Polynomial<Z> mC = RING.empty();
  {
    mC.add(Z.ZERO);
  }

  @Override
  public Z next() {
    mC.add(super.next().negate());
    Z sum = Z.ZERO;
    for (int j = 1; j <= mN; ++j) {
      sum = sum.add(RING.log1p(mC.substitutePower(j, mN), mN).coeff(mN).multiply(LongUtils.phi(j)).divide(j));
    }
    return sum.negate();
  }
}

// G.f. appears to be -Sum_{j>=1} (phi(j)/j) * log(1-C(x^j)), where phi = A000010 and C is the g.f. of A050383.
