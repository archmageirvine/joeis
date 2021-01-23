package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036996 Number of isomers of alkyl homologs of adamantane with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A036996 extends A000598 {

  @Override
  public Z next() {
    super.next(); // updates mG and mN
    final Polynomial<Q> gs2 = mG.substitutePower(2, mN);
    return RING.pow(mG, 16, mN).coeff(mN)
      .add(RING.pow(gs2, 8, mN).coeff(mN).multiply(3))
      .add(RING.multiply(mG, RING.pow(mG.substitutePower(3, mN), 5, mN), mN).coeff(mN).multiply(8))
      .add(RING.multiply(RING.pow(mG, 4, mN), RING.pow(gs2, 6, mN), mN).coeff(mN).multiply(6))
      .add(RING.pow(mG.substitutePower(4, mN), 4, mN).coeff(mN).multiply(6))
      .divide(24).toZ();
  }
}
