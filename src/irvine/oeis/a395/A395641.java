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
 * A395641 Triangular array: row n shows the coefficients of the polynomial - n!*L(n, x), where L(n, x) is the Lagrange interpolating polynomial that passes through (0,-1) and (k,1) for k = 1..n.
 * @author Sean A. Irvine
 */
public class A395641 extends Sequence0 {

  private Polynomial<Q> mP = Polynomial.create(Q.ZERO);
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      final long[] x = LongUtils.identity(new long[++mN + 1]);
      final long[] y = new long[mN + 1];
      Arrays.fill(y, 1);
      y[0] = -1;
      mP = PolynomialUtils.lagrangeInterpolate(x, y);
      mM = 0;
    }
    return mP.coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ().negate();
  }
}
