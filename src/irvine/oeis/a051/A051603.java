package irvine.oeis.a051;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A051603 Expansion of square of g.f. for A051573.
 * @author Sean A. Irvine
 */
public class A051603 extends A051573 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.pow(mA, 2, ++mN).coeff(mN);
  }
}
