package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.BikTransformSequence;

/**
 * A032132 Number of series-reduced dyslexic planted planar trees with n leaves.
 * @author Sean A. Irvine
 */
public class A032132 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    mA.add(Z.ZERO);
    final Z res = BikTransformSequence.bik(mA).coeff(mN);
    mA.set(mN, res);
    return res;
  }
}
