package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058521 B-trees of order 5 with n labeled leaves.
 * @author Sean A. Irvine
 */
public class A058521 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> M = Polynomial.create(0, 0, 1, 1, 1, 1);
  private int mN = 0;
  private Polynomial<Z> mB = RING.x();

  @Override
  public Z next() {
    ++mN;
    mB = RING.add(RING.x(), RING.substitute(mB, M, mN));
    return mB.coeff(mN);
  }
}
