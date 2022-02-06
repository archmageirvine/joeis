package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a002.A002894;

/**
 * A054474 Number of walks on square lattice that start and end at origin after 2n steps, not touching origin at intermediate stages.
 * @author Sean A. Irvine
 */
public class A054474 extends A002894 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mA.add(super.next());
    return RING.coeff(RING.one(), mA, ++mN).abs();
  }
}
