package irvine.oeis.a395;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395640 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395640 extends Sequence0 {

  private Polynomial<Q> mP = Polynomial.create(Q.ZERO);
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      final long[] x = new long[++mN + 1];
      final long[] y = new long[mN + 1];
      for (int k = 0; k < x.length; ++k) {
        x[k] = k + 1;
      }
      Arrays.fill(y, 1);
      y[0] = 0;
      mP = PolynomialUtils.lagrangeInterpolate(x, y);
      mM = 0;
    }
    return mP.coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ().negate();
  }
}
