
package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Derivative of the Riemann zeta function.
 * Uses Euler-Maclaurin summation differentiated with respect to s.
 * @author Sean A. Irvine
 */
public final class ZetaPrime extends CrFunction1 {

  @Override
  public CR cr(final CR s) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int bits = Math.max(0, -precision);

        // Make N large enough both for the requested precision and
        // for the magnitude of the argument.
        final long sm = s.getApprox(0).abs().longValue();
        final int n = (int) Math.min(Integer.MAX_VALUE / 4L, Math.max(16L + (long) Math.ceil(0.12 * (bits + 32)), sm + 32L));

        final CR cn = CR.valueOf(n);
        final CR logN = cn.log();
        final CR sMinusOne = s.subtract(CR.ONE);

        // -sum_{k=1}^{N-1} log(k) * k^(-s)
        CR result = CR.ZERO;
        for (int k = 2; k < n; ++k) {
          final CR ck = CR.valueOf(k);
          final CR logK = ck.log();
          result = result.subtract(logK.multiply(s.multiply(logK).negate().exp()));
        }

        // Derivative of N^(1-s) / (s-1).
        final CR first = CR.ONE.subtract(s).multiply(logN).exp();
        result = result.add(first.multiply(logN.negate().divide(sMinusOne).subtract(CR.ONE.divide(sMinusOne.multiply(sMinusOne)))));

        // Derivative of N^(-s) / 2.
        result = result.subtract(logN.multiply(s.negate().multiply(logN).exp()).divide(CR.TWO));

        // Euler-Maclaurin corrections:
        // B_(2r)/(2r)! * (s)_(2r-1) * N^(-s-2r+1).
        CR power = s.negate().subtract(CR.ONE).multiply(logN).exp();
        Z previous = null;

        for (int r = 1; ; ++r) {
          final int q = 2 * r - 1;

          // Rising factorial P = (s)_q and its derivative P'.
          CR p = CR.ONE;
          CR dp = CR.ZERO;
          for (int j = 0; j < q; ++j) {
            final CR factor = s.add(CR.valueOf(j));
            dp = dp.multiply(factor).add(p);
            p = p.multiply(factor);
          }

          final Q coefficient = Functions.BERNOULLI.q(2 * r).divide(Functions.FACTORIAL.z(2 * r));

          // d/ds [P(s) N^(-s-q)] = N^(-s-q) * [P'(s) - log(N) P(s)].
          final CR term = CR.valueOf(coefficient).multiply(power).multiply(dp.subtract(logN.multiply(p)));
          final Z size = term.getApprox(precision - 8).abs();
          if (size.isZero() || (previous != null && size.compareTo(previous) > 0)) {
            break;
          }
          result = result.add(term);
          previous = size;
          power = power.multiply(CR.ONE.divide(cn.multiply(cn)));
        }
        return result.getApprox(precision);
      }
    };
  }
}
