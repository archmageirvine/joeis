package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022577 Expansion of <code>Product_{m&gt;=1} (1+x^m)^12</code>.
 * @author Sean A. Irvine
 */
public class A022577 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.onePlusXToTheN(k), mN);
    }
    return RING.pow(p, 12, mN).coeff(mN);
  }
}
