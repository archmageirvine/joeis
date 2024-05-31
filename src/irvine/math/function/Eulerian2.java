package irvine.math.function;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Eulerian numbers of the second kind.
 * @author Sean A. Irvine
 */
class Eulerian2 extends AbstractFunction2 {

  private final HashMap<String, Z> mSecondKind = new HashMap<>();

  @Override
  public Z z(final long n, final long m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z s = mSecondKind.get(key);
    if (s != null) {
      return s;
    }
    final Z r = z(n - 1, m).multiply(m + 1).add(z(n - 1, m - 1).multiply(2 * n - m - 1));
    mSecondKind.put(key, r);
    return r;
  }
}
