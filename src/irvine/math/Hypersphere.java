package irvine.math;

import irvine.math.z.Z;

import java.util.HashMap;

/**
 * Count number of points in a hypersphere of given radius.
 * @author Sean A. Irvine
 */
public final class Hypersphere {

  private Hypersphere() { }

  private static final HashMap<String, Z> CACHE = new HashMap<>();

  private static boolean perfect(final long n) {
    final long q = LongUtils.sqrt(n);
    return q * q == n;
  }

  /**
   * Return the number of integer points with <code>k</code>-dimensional hypersphere
   * of radius <code>n</code>.
   *
   * @param k degree
   * @param n radius
   * @return number of points
   */
  public static Z countPoints(final int k, final long n) {
    final String key = k + "_" + n;
    Z c = CACHE.get(key);
    if (c != null) {
      return c;
    }
    if (k == 1) {
      if (n == 0) {
        c = Z.ONE;
      } else {
        c = countPoints(1, n - 1);
        if (perfect(n)) {
          c = c.add(2);
        }
      }
    } else {
      c = Z.ZERO;
      for (int j = 1; j <= LongUtils.sqrt(n); ++j) {
        c = c.add(countPoints(k - 1, n - j * j));
      }
      c = c.multiply2().add(countPoints(k - 1, n));
    }
    CACHE.put(key, c);
    return c;
  }

}

