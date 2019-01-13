package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006932.
 * @author Sean A. Irvine
 */
public class A006932 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mCoeff = new ArrayList<>();
  {
    mCoeff.add(Z.ONE);
  }
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mCoeff.add(mF);
    final Polynomial<Z> t = RING.create(mCoeff);
    return mF.subtract(RING.coeff(t, RING.add(RING.one(), t.shift(1)), mN));
  }
}
