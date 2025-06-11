package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001246;

/**
 * A006664 Number of irreducible systems of meanders.
 * @author Sean A. Irvine
 */
public class A006664 extends A001246 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mS = RING.empty();

  @Override
  public Z next() {
    ++mN;
    mS.add(super.next());
    final Polynomial<Z> t = RING.reversion(RING.multiply(mS, mS, mN - 1).shift(1), mN);
    final Polynomial<Z> u = RING.substitute(mS, t, mN);
    return u.coeff(mN);
  }
}
