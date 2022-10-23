package irvine.oeis.a057;

import irvine.math.Mobius;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057793 Integer nearest Riemann(10^n), where Riemann(x) = Sum of ( mu(k)/k * Integral Log( x^(1/k) ) for k = 1 to infinity.
 * @author Sean A. Irvine
 */
public class A057793 extends Sequence1 {

  private static final long HEURISTIC_TERMS = 120; // same as limit used in Mathematica code
  private Z mA = Z.ONE;

  private CR riemann(final Z x) {
    // WARNING: This computation is not exact
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final CR z = CR.valueOf(x);
        Z sum = Z.ZERO;
        long k = 0;
        while (true) {
          final int mu = Mobius.mobius(++k);
          if (mu != 0) {
            final Z li = z.pow(new Q(1, k)).li().divide(CR.valueOf(k)).getApprox(precision);
            if (li.isZero()) {
              break;
            }
            sum = sum.signedAdd(mu == 1, li);
          }
          if (k > HEURISTIC_TERMS) { // This makes the calculation approximate
            break;
          }
        }
        return sum;
      }
    };
  }

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return riemann(mA).round();
  }
}
