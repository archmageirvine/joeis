package irvine.oeis.a059;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059272 G.f. is g.f. for A059271 divided by g.f. for A059227.
 * @author Sean A. Irvine
 */
public class A059272 extends A059271 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mA = new A059227();
  private final Polynomial<Z> mNum = RING.empty();
  private final Polynomial<Z> mDen = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mNum.add(super.next());
    mDen.add(mA.next());
    return RING.coeff(mNum, mDen, ++mN);
  }
}
