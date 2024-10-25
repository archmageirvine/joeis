package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Hypergeometric functions.
 * Does not check in advance for convergence.
 * @author Sean A. Irvine
 */
public final class HypergeometricImpl {

  private HypergeometricImpl() { }

  private static final int EXTRA_PRECISION = 10;

  static CR hypergeometric(final CR[] upper, final CR[] lower, final CR z) {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        final int p = precision - EXTRA_PRECISION;
        final Z[] uz = new Z[upper.length];
        for (int j = 0; j < upper.length; ++j) {
          uz[j] = upper[j].getApprox(p);
        }
        final Z[] lz = new Z[lower.length];
        for (int j = 0; j < lower.length; ++j) {
          lz[j] = lower[j].getApprox(p);
        }
        final int scalingSteps = 1 + upper.length - lower.length;
        final Z zz = z.getApprox(p);
        final Z one = CR.scale(Z.ONE, -p);
        Z sum = one; // k == 0
        Z prod = one;
        long k = 0;
        while (true) {
          final Z sk = CR.scale(Z.valueOf(k++), -p); // i.e, sk = scaled k-1
          prod = prod.multiply(zz);
          for (final Z u : uz) {
            prod = prod.multiply(u.add(sk));
          }
          for (final Z l : lz) {
            prod = prod.divide(l.add(sk));
          }
          prod = prod.divide(k);
          prod = CR.scale(prod, scalingSteps * p);
          if (prod.isZero()) {
            return CR.scale(sum, -EXTRA_PRECISION);
          }
          sum = sum.add(prod);
        }
      }
    };
  }
}
