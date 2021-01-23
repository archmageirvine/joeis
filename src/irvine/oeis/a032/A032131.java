package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.BikTransformSequence;
import irvine.oeis.Sequence;

/**
 * A032131 Shifts left 2 places under the "BIK" (reversible, indistinct, unlabeled) transform with a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A032131 implements Sequence {

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
    final Z res = BikTransformSequence.bik(mA).coeff(mN - 2);
    mA.add(res);
    return res;
  }
}
