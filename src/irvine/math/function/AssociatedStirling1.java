package irvine.math.function;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Associated Stirling numbers of the first kind.
 * @author Sean A. Irvine
 */
class AssociatedStirling1 extends AbstractFunction2 {

  private final HashMap<String, Z> mAssociatedFirstKindCache = new HashMap<>();
  {
    mAssociatedFirstKindCache.put("1_1", Z.ZERO);
  }

  @Override
  public Z z(final long n, final long m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    final String key = n + "_" + m;
    final Z d = mAssociatedFirstKindCache.get(key);
    if (d != null) {
      return d;
    }
    final long a = n - 1;
    final Z r = z(a, m).add(z(a - 1, m - 1)).multiply(a);
    mAssociatedFirstKindCache.put(key, r);
    return r;
  }
}
