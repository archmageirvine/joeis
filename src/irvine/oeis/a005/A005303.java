package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005303.
 * @author Sean A. Irvine
 */
public class A005303 implements Sequence {

  // I'm not sure that the continuation of this power function is correct.

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final int[] IRREGULAR_POWERS = {0, 0, 2, 4, 3, 4};

  private int mN = -1;

  protected int power(final int n) {
    return n < IRREGULAR_POWERS.length ? IRREGULAR_POWERS[n] : ((n & 1) == 0 ? 2 : 4);
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k), power(k), mN), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}
