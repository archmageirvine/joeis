package irvine.oeis.a035;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035378 Coefficients in expansion of Sum_{k=0..inf} Prod_{j=1..k} (1-x^j) about x = -1.
 * @author Sean A. Irvine
 */
public class A035378 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(-1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.one();
    Polynomial<Z> product = RING.one();
    Polynomial<Z> t = C;
    for (int k = 1; k <= 2 * mN + 1; ++k, t = RING.multiply(t, C, mN)) {
      product = RING.multiply(product, RING.subtract(RING.one(), t), mN);
      sum = RING.add(sum, product);
    }
    return sum.coeff(mN);
  }
}

