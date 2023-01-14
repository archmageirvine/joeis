package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.a100.A100130;

/**
 * A002470 Glaisher's function W(n).
 * @author Sean A. Irvine
 */
public class A002470 extends A100130 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA100130 = RING.empty();
  private final A100130 mSeq = new A100130();
  {
    mA100130.add(Z.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    mA100130.add(mSeq.next());
    final Polynomial<Z> a = ThetaFunctions.theta3z(++mN);
    return RING.multiply(RING.pow(RING.multiply(a, a, mN), 7, mN), mA100130, mN).coeff(mN);
  }
}
