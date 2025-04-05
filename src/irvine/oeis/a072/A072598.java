package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072598 a(n)= 3^(4*n-4)* Sum_{k&gt;=0} ( Gamma(n+k/3+1/3) / Gamma(4/3+k/3) ) * (Gamma(n+k/3+2/3) / Gamma(5/3+k/3) ) * (Gamma(n+k/3+1) / Gamma(2+k/3) ) * Gamma(n+k/3+4/3) / ( Gamma(7/3+k/3) * k! *exp(1)).
 * @author Sean A. Irvine
 */
public class A072598 extends Sequence1 {

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
            .multiply(CrFunctions.GAMMA.cr(CR.valueOf(new Q(3 * mN + k + 4, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 4, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 5, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 6, 3))))
            .divide(CrFunctions.GAMMA.cr(CR.valueOf(new Q(k + 7, 3))))
            .getApprox(precision)
            .divide(Functions.FACTORIAL.z(k));
          if (z.isZero()) {
            return sum;
          }
          sum = sum.add(z);
        }
      }
    }.multiply(Z.THREE.pow(4 * mN - 4)).divide(CR.E).assumeInt().toZ();
  }
}
