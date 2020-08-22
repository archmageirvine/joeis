package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005380 Expansion of 1 / Product_{k&gt;=1} (1-x^k)^(k+1).
 * @author Sean A. Irvine
 */
public class A005380 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.pow(RING.oneMinusXToTheN(k), k + 1, mN), mN);
    }
    return RING.coeff(RING.one(), p, mN);
  }
}
