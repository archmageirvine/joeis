package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036759 Number of mirror-symmetrical edge-rooted tree-like octagonal systems.
 * @author Sean A. Irvine
 */
public class A036759 extends Sequence1 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(0, -2, 1);
  private static final Polynomial<Z> C2 = Polynomial.create(2, -6, 2);
  private static final Polynomial<Z> C3 = Polynomial.create(0, 2, 1);
  private static final Polynomial<Z> C4 = Polynomial.create(-2, 3, 1);
  protected Polynomial<Z> mV = RING.zero();
  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> v2 = RING.multiply(mV, mV, mN);
    final Polynomial<Z> v3 = RING.multiply(mV, v2, mN);
    mV = RING.series(RING.subtract(RING.add(RING.multiply(v3, C1, mN), RING.multiply(v2, C2, mN)), C3), C4, mN);
    return mV.coeff(mN);
  }
}
