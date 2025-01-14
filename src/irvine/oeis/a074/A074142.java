package irvine.oeis.a074;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a005.A005097;

/**
 * A074142 a(n) is the coefficient of x^n in x/(1 + Sum_{k&gt;=1} (1/2)*(prime(k+1) - 1)*x^k).
 * @author Sean A. Irvine
 */
public class A074142 extends A005097 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    final int n = mA.degree();
    mA.add(super.next());
    return RING.coeff(RING.one(), mA, n);
  }
}
