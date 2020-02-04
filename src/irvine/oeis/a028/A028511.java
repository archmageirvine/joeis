package irvine.oeis.a028;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028511 q-expansion of character of vertex-operator superalgebra of rank 23.5 on which Baby Monster group acts.
 * @author Sean A. Irvine
 */
public class A028511 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z47 = Z.valueOf(47);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> a = RING.one();
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      a = RING.multiply(a, RING.onePlusXToTheN(2 * k - 1), mN);
    }
    return RING.subtract(RING.pow(a, 47, mN), RING.multiply(RING.pow(a, 23, mN), Z47).shift(1)).coeff(mN);
  }
}
