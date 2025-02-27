package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075581 Let P(n,X) = Product_{i=1..2n+1} (X - 1/cos(Pi*k/(2n+1))); then P(n,X) is a polynomial with integer coefficients. Sequences gives maximum values of absolute values of coefficients of P(n,X).
 * @author Sean A. Irvine
 */
public class A075581 extends Sequence0 {

  private static final PolynomialRing<CR> RING = new PolynomialRing<>(ComputableReals.SINGLETON);
  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Polynomial<CR> p = RING.one();
    for (long k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.create(Arrays.asList(CR.PI.multiply(k).divide(mN).cos().inverse().negate(), CR.ONE)));
    }
    Z max = Z.ZERO;
    for (final CR c : p) {
      max = max.max(c.assumeInt().toZ().abs());
    }
    return max;
  }
}

