package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072402 a(n) = 6^n * Sum_{k&gt;=1} Gamma(n + k/6)/ (k! * Gamma(k/6) * e).
 * @author Sean A. Irvine
 */
public class A072402 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final CR sum = new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z s = Z.ZERO;
        long k = 0;
        while (true) {
          ++k;
          final Z t = CR.valueOf(new Q(6L * mN + k, 6)).gamma().divide(CR.valueOf(new Q(k, 6)).gamma().multiply(Functions.FACTORIAL.z(k))).getApprox(precision);
          if (t.isZero()) {
            return s;
          }
          s = s.add(t);
        }
      }
    }.divide(CR.E).multiply(Z.SIX.pow(mN));
    return sum.assumeInt().toZ();
  }
}
