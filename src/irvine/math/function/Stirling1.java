package irvine.math.function;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
class Stirling1 extends AbstractFunction2 {

  private final HashMap<String, Z> mFirstKind = new HashMap<>();

  @Override
  public Z z(final long n, final long m) {
    if (n < 0 || m < 0) {
      throw new IllegalArgumentException();
    }
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (m == 0) {
      return Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z s = mFirstKind.get(key);
    if (s != null) {
      return s;
    }
    final Z r = z(n - 1, m - 1).subtract(z(n - 1, m).multiply(n - 1));
    mFirstKind.put(key, r);
    return r;
  }
}
