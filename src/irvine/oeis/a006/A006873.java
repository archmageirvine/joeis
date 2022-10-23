package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006873 Number of alternating 4-signed permutations.
 * @author Sean A. Irvine
 */
public class A006873 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> THREE_X = RING.create(Arrays.asList(Q.ZERO, Q.THREE));
  private static final Polynomial<Q> FOUR_X = RING.create(Arrays.asList(Q.ZERO, Q.FOUR));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> num = RING.add(RING.sin(RING.x(), mN), RING.cos(THREE_X, mN));
    return RING.coeff(num, RING.cos(FOUR_X, mN), mN).multiply(mF).toZ();
  }
}
