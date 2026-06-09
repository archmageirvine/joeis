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
 * A395641 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395641 extends Sequence0 {

  // todo does not match

  private Polynomial<Q> mP = Polynomial.create(Q.ZERO);
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
//    System.out.println(PolynomialUtils.lagrangeInterpolate(new long[] {0}, new long[] {-1}));
//    System.out.println(PolynomialUtils.lagrangeInterpolate(new long[] {0, 1}, new long[] {-1, 1}));
//    System.out.println(PolynomialUtils.lagrangeInterpolate(new long[] {0, 1, 2}, new long[] {-1, 1, 1}));
//    System.out.println(PolynomialUtils.lagrangeInterpolate(new long[] {0, 1, 2, 3}, new long[] {-1, 1, 1, 1}));
//    System.out.println(PolynomialUtils.lagrangeInterpolate(new long[] {0, 1, 2, 3, 4}, new long[] {-1, 1, 1, 1, 1}));
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
