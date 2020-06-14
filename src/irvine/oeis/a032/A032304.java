package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032304 "EFK" <code>(unordered</code>, size, unlabeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032304 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> egf = RING.one();
    for (int k = 1; k <= mN; ++k) {
      egf = RING.multiply(egf, RING.onePlusXToTheN(Z.valueOf(2L * k - 1), k), mN);
    }
    return egf.coeff(mN);
  }
}
