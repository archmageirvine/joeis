package irvine.math.function;

import java.util.HashMap;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;

/**
 * Count number of points in a hypersphere of given radius in a given number of dimensions.
 * @author Sean A. Irvine
 */
public final class HyperspherePoints extends AbstractFunction2 {

  private final HashMap<String, Z> mCache = new HashMap<>();

  @Override
  public long getDefault() {
    return 2;
  }

  @Override
  public Z z(final long k, final long n) {
    final String key = k + "_" + n;
    Z c = mCache.get(key);
    if (c != null) {
      return c;
    }
    if (k == 1) {
      if (n == 0) {
        c = Z.ONE;
      } else {
        c = z(1, n - 1);
        if (Predicates.SQUARE.is(n)) {
          c = c.add(2);
        }
      }
    } else {
      c = Z.ZERO;
      for (long j = 1; j <= LongUtils.sqrt(n); ++j) {
        c = c.add(z(k - 1, n - j * j));
      }
      c = c.multiply2().add(z(k - 1, n));
    }
    mCache.put(key, c);
    return c;
  }
}

