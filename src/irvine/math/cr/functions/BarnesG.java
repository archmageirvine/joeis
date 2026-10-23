package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Barnes G-function.
 * G(z+1) = Gamma(z) G(z), G(1) = 1.
 * Uses an asymptotic expansion with Euler-Maclaurin evaluation of zeta'(-1).
 * @author Sean A. Irvine
 */
public final class BarnesG extends CrFunction1 {

  // Constructed with the assistance of ChatGPT

  private static final CR ZETA_PRIME_NEG1 = new ZetaPrime().cr(-1);

  @Override
  public CR cr(final CR x) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        // Move the argument sufficiently far into the positive
        // real axis for the asymptotic expansion.
        final int bits = Math.max(0, -precision);
        final int shift = Math.max(16, (int) Math.ceil(0.12 * (bits + 32)) + 16);

        // log G(x + shift), using the expansion for log G(z + 1).
        final CR z = x.add(CR.valueOf(shift - 1L));
        final CR logZ = z.log();
        final CR z2 = z.multiply(z);

        CR logG = z2.multiply(logZ).divide(CR.TWO)
          .subtract(z2.multiply(CR.valueOf(3)).divide(CR.valueOf(4)))
          .add(z.multiply(CR.PI.multiply(CR.TWO).log()).divide(CR.TWO))
          .subtract(logZ.divide(CR.valueOf(12)))
          .add(ZETA_PRIME_NEG1); //zetaPrimeMinusOne(shift, precision - 8));

        // Bernoulli asymptotic series for log G(z + 1).
        final CR invZ2 = CR.ONE.divide(z2);
        CR power = invZ2;
        Z previous = null;

        for (int k = 1; ; ++k) {
          final Q coefficient = Functions.BERNOULLI.q(2 * k + 2).divide(Q.valueOf(2L * k * (2L * k + 2)));
          final CR term = CR.valueOf(coefficient).multiply(power);
          final Z size = term.getApprox(precision - 8).abs();

          // Stop when the term is negligible at the requested
          // precision, or when the asymptotic terms start growing.
          if (size.isZero() || (previous != null && size.compareTo(previous) > 0)) {
            break;
          }

          logG = logG.add(term);
          previous = size;
          power = power.multiply(invZ2);
        }

        // Undo the recurrence shift:
        // G(x + shift) = G(x) * product Gamma(x + j).
        for (int j = 0; j < shift; ++j) {
          logG = logG.subtract(x.add(CR.valueOf(j)).lnGamma());
        }
        return logG.exp().getApprox(precision);
      }
    };
  }
}
