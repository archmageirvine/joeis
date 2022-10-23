package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.transform.BikTransformSequence;

/**
 * A032130 Shifts left under the "BIK" (reversible, indistinct, unlabeled) transform with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A032130 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.empty();
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      mA.add(Z.TWO);
      return Z.TWO;
    }
    final Z res = BikTransformSequence.bik(mA).coeff(mN - 1);
    mA.add(res);
    return res;
  }
}
