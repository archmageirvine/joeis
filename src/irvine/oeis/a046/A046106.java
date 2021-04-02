package irvine.oeis.a046;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001411;
import irvine.oeis.a004.A004018;

/**
 * A046106 G.f.: g.f. for A001411 / g.f. for A004018.
 * @author Sean A. Irvine
 */
public class A046106 extends A001411 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mTheta = new A004018();
  private final Polynomial<Z> mNum = RING.empty();
  private final Polynomial<Z> mDen = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mNum.add(super.next());
    mDen.add(mTheta.next());
    return RING.coeff(mNum, mDen, ++mN);
  }
}
