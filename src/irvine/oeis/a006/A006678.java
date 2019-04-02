package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006678 Number of planted binary phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A006678 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.TWO, Q.TWO));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.subtract(RING.one(), RING.sqrt1m(C, mN)), RING.onePlusXToTheN(1), mN).multiply(mF).toZ();
  }

}
