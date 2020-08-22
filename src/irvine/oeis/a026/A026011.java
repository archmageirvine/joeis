package irvine.oeis.a026;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026011 Expansion of Product_{m&gt;=1} (1 + q^m)^(2*m).
 * @author Sean A. Irvine
 */
public class A026011 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.pow(RING.onePlusXToTheN(k), 2 * k, mN), mN);
    }
    return prod.coeff(mN);
  }
}

