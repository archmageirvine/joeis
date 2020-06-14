package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032303 "EFK" <code>(unordered</code>, size, unlabeled) transform of 2,1,1,1,...
 * @author Sean A. Irvine
 */
public class A032303 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> egf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      egf = RING.multiply(egf, RING.onePlusXToTheN(k == 1 ? Z.TWO : Z.ONE, k), mN);
    }
    return egf.coeff(mN);
  }
}
