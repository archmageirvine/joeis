package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053413.
 * @author Sean A. Irvine
 */
public class A053415 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final int c = ++mN * mN;
    return RING.series(RING.pow(ThetaFunctions.theta2(c).substitutePower(4, new Q(c)).toPolynomial(), 2, c), RING.oneMinusXToTheN(1), c).coeff(c);
  }
}
