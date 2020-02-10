package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028625 Expansion of <code>(theta_3(z)*theta_3(15z)+theta_2(z)*theta_2(15z))</code>.
 * @author Sean A. Irvine
 */
public class A028625 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int power() {
    return 1;
  }

  @Override
  public Z next() {
    ++mN;
    final int t = (mN + 14) / 15;
    final QPolynomial<Z> a = RING.multiply(ThetaFunctions.theta3(mN), ThetaFunctions.theta3(t).substitutePower(15), mN);
    final QPolynomial<Z> b = RING.multiply(ThetaFunctions.theta2(mN), ThetaFunctions.theta2(t).substitutePower(15), mN);
    return RING.pow(RING.add(a, b), power(), mN).coeff(mN);
  }
}
