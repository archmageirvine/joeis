package irvine.oeis.a038;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A038060 Number of trees with 3-colored nodes.
 * @author Sean A. Irvine
 */
public class A038060 extends A038059 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mB = new ArrayList<>();
  {
    setOffset(0);
    mB.add(Z.ZERO);
  }
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    mB.add(super.next());
    final Polynomial<Z> b = RING.create(mB);
    return RING.add(b, RING.divide(RING.subtract(b.substitutePower(2), RING.pow(b, 2, mN)), Z.TWO)).coeff(mN);
  }
}
