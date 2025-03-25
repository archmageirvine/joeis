package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A057793 Integer nearest Riemann(10^n), where Riemann(x) = Sum_{k=1..infinity} mu(k)/k * Integral Log( x^(1/k) ).
 * @author Sean A. Irvine
 */
public class A057793 extends Sequence1 implements Conjectural {

  // These heuristics are sufficient for at least the first 100 terms
  private static final long HEURISTIC_TERMS = 300;
  private static final int EXTRA_PRECISION = 5;
  private Z mA = Z.ONE;

  private CR riemann(final Z x) {
    // WARNING: This computation is not exact
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final CR z = CR.valueOf(x);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final long n = ++k;
          final int mu = Functions.MOBIUS.i(n);
          if (mu != 0) {
            final Z li = CrFunctions.LI.cr(z.pow(new Q(1, k))).divide(CR.valueOf(k)).getApprox(p);
            if (li.isZero()) {
              break;
            }
            sum = sum.signedAdd(mu == 1, li);
          }
          if (k > HEURISTIC_TERMS) { // This makes the calculation approximate
            break;
          }
        }
        return sum.shiftRight(EXTRA_PRECISION);
      }
    };
  }

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return riemann(mA).round();
  }
}
