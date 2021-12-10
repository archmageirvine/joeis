package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.BikTransformSequence;

/**
 * A032133 Number of series-reduced dyslexic planted planar trees with n leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032133 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      mA.add(Z.TWO);
      return Z.TWO;
    }
    mA.add(Z.ZERO);
    final Z res = BikTransformSequence.bik(mA).coeff(mN);
    mA.set(mN, res);
    return res;
  }
}
