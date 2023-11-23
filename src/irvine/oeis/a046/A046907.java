package irvine.oeis.a046;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000112;

/**
 * A000798.
 * @author Sean A. Irvine
 */
public class A046907 extends A000112 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();

  @Override
  public Z next() {
    mB.add(super.next());
    return mB.size() == 1 ? Z.ONE : RING.coeff(RING.one(), mB, mB.size() - 1).negate();
  }
}
