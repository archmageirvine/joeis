package irvine.oeis.a060;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a065.A065409;

/**
 * A060042 G.f.: V(x)^(1/4), where V(x) = Sum_{n &gt;= 0} A065409(n)*x^n.
 * @author Sean A. Irvine
 */
public class A060042 extends A065409 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    return RING.sqrt(RING.sqrt(mA, mN), mN).coeff(mN);
  }
}
