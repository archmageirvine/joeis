package irvine.oeis.a086;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000625;

/**
 * A086194 Number of unrooted steric quartic trees with n (unlabeled) nodes and possessing a centroid; number of n carbon alkanes C(n)H(2n +2) with a centroid when stereoisomers are regarded as different.
 * @author Sean A. Irvine
 */
public class A086194 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mS = new A000625();
  private final Polynomial<Z> mR = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      mR.add(mS.next());
    }
    return RING.pow(mR, 4, mN).coeff(mN)
      .add(RING.multiply(mR.substitutePower(3, mN), mR, mN).coeff(mN).multiply(8))
      .add(RING.pow(mR.substitutePower(2, mN), 2, mN).coeff(mN).multiply(3))
      .divide(12);
  }
}

