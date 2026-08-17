package irvine.oeis.a287;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A287891 Number of rooted unlabeled 4-cactus graphs on 3n+1 nodes.
 * @author Sean A. Irvine
 */
public class A287891 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mS = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mS.add(Z.ONE);
    } else {
      final Polynomial<Z> g = RING.divide(RING.multiply(mS, RING.add(RING.pow(mS, 2, mN), mS.substitutePower(2, mN)), mN), Z.TWO);
      final Z t = EulerTransformUtils.eulerTransform(g, mN);
      mS.add(t);
    }
    return mS.coeff(mN);
  }
}
