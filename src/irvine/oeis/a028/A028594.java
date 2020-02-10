package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028594 Expansion of <code>(theta_3(q) * theta_3(q^7) + theta_2(q) * theta_2(q^7))^2</code> in powers of q.
 * @author Sean A. Irvine
 */
public class A028594 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int power() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    final int t = (mN + 6) / 7;
    final QPolynomial<Z> a = RING.multiply(ThetaFunctions.theta3(mN), ThetaFunctions.theta3(t).substitutePower(7), mN);
    final QPolynomial<Z> b = RING.multiply(ThetaFunctions.theta2(mN), ThetaFunctions.theta2(t).substitutePower(7), mN);
    return RING.pow(RING.add(a, b), power(), mN).coeff(mN);
  }
}
