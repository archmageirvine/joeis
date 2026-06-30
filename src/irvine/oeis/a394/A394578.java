package irvine.oeis.a394;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394578 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A394578 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final long[] x = new long[++mN + 1];
    final long[] y = new long[mN + 1];
    for (int k = 0; k < x.length; ++k) {
      x[k] = k + 1;
    }
    Arrays.fill(y, 1);
    y[0] = 0;
    final Polynomial<Q> p = PolynomialUtils.lagrangeInterpolate(x, y);
    return RING.eval(p, Q.HALF.add(mN)).multiply(Z.TWO.pow(2L * mN - 1)).toZ();
  }
}
