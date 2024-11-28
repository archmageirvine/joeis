package irvine.math.dirichlet;

import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Inverse of a Dirichlet series.
 * @author Sean A. Irvine
 */
class Inverse extends AbstractDs {

  private final Ds mF;
  private final Map<Z, Z> mCache = new HashMap<>();

  /**
   * Construct the inverse of a Dirichlet series.
   * @param f series
   */
  Inverse(final Ds f) {
    mF = Dgf.remember(f);
  }

  @Override
  public Z coeff(final Z n) {
    return mCache.computeIfAbsent(n, k -> {
      final Z an = mF.coeff(k);
      if (an.isZero()) {
        return Z.ZERO;
      }
      if (Z.ONE.equals(k)) {
        return Z.ONE.divide(mF.coeff(k));
      }
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!Z.ONE.equals(d)) {
          final Z ad = mF.coeff(d);
          if (!ad.isZero()) {
            sum = sum.subtract(ad.multiply(coeff(k.divide(d))));
          }
        }
      }
      return sum.divide(an);
    });
  }
}
