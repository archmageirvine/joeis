package irvine.math.dirichlet;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Wrap a Dirichlet function with a cache.
 * @author Sean A. Irvine
 */
class Remember extends AbstractDs {

  private final Map<Z, Z> mCache = new HashMap<>();
  private final Ds mF;

  /**
   * Wrap a Dirichlet function with a cache.
   * @param f Dirichlet series
   */
  Remember(final Ds f) {
    mF = f;
  }

  @Override
  public Z coeff(final Z n) {
    return mCache.computeIfAbsent(n, mF::coeff);
  }
}
