package irvine.oeis.a076;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076625 Maximum of the absolute values of the coefficients of P(n,x) where P(n,x) = 4^(n-1)*Product_{k=0..n} (x - cos(k*Pi/n)^2).
 * @author Sean A. Irvine
 */
public class A076625 extends Sequence1 {

  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<CR> p = RING.one();
    for (int k = 0; k <= mN; ++k) {
      final Polynomial<CR> t = RING.create(Arrays.asList(CR.PI.multiply(k).divide(mN).cos().square().negate(), CR.ONE));
      p = RING.multiply(p, t);
    }
    p = RING.multiply(p, CR.valueOf(Z.ONE.shiftLeft(2L * (mN - 1))));
    Z max = Z.ZERO;
    for (final CR c : p) {
      final Z ac = c.assumeInt().toZ().abs();
      max = max.max(ac);
    }
    return max;
  }
}
