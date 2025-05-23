package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072020 Sum of an infinite series: a(n) = Sum_{k = 0..infinity} ((1/27) * (3^n)^3 * Gamma(n+1/3*k+1/3) * Gamma(n+1/3*k+2/3) * Gamma(n+1/3*k+1)) / (Gamma(4/3+1/3*k) * Gamma(5/3+1/3*k) * Gamma(2+1/3*k) * exp(1) * k!).
 * @author Sean A. Irvine
 */
public class A072020 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        long k = -1;
        while (true) {
          ++k;
          final Z z = CrFunctions.GAMMA.cr(CR.valueOf(new Q(3 * mN + k + 1, 3)))
            .multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(3 * mN + k + 2, 3))))
            .multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(3 * mN + k + 3, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 4, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 5, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 6, 3))))
            .getApprox(precision)
            .divide(Functions.FACTORIAL.z(k));
          if (z.isZero()) {
            return sum;
          }
          sum = sum.add(z);
        }
      }
    }.multiply(Z.valueOf(27).pow(mN - 1)).divide(CR.E).assumeInt().toZ();
  }
}
