package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075614 Let P(k,X) = 4^k*Product_{i=1..k} (X - cos(Pi*i/k)) (which is a polynomial with integer coefficients). Sequence gives maximum values of coefficients of P(n,X).
 * @author Sean A. Irvine
 */
public class A075614 extends Sequence1 {

  private static final PolynomialRing<CR> RING = new PolynomialRing<>(ComputableReals.SINGLETON);
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<CR> p = RING.one();
    for (long k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.create(Arrays.asList(CR.PI.multiply(k).divide(mN).cos().negate(), CR.ONE)));
    }
    Z max = Z.ZERO;
    for (final CR c : p) {
      max = max.max(c.multiply(Z.ONE.shiftLeft(2 * mN)).assumeInt().toZ().abs());
    }
    return max;
  }
}

