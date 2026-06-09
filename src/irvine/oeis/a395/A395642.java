package irvine.oeis.a395;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395642 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395642 extends Sequence0 {

  private Polynomial<Q> mP = Polynomial.create(Q.ZERO);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      final long[] x = LongUtils.identity(new long[++mN + 1]);
      final long[] y = new long[mN + 1];
      for (int k = 1; k < y.length; ++k) {
        y[k] = (k & 1) == 1 ? 1 : -1;
      }
      mP = PolynomialUtils.lagrangeInterpolate(x, y);
      mM = 0;
      if (mN == 4) {
        System.out.println(Arrays.toString(x) + " " + Arrays.toString(y) + " -> " + mP);
      }
    }
    return mP.coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ().negate();
  }
}
