package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007249 McKay-Thompson series of class 4D for the Monster group.
 * @author Sean A. Irvine
 */
public class A007249 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.onePlusXToTheN(k), mN);
    }
    return RING.coeff(RING.one(), RING.pow(p, 12, mN), mN);
  }
}
