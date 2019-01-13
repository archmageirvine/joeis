package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A000569.
 * @author Sean A. Irvine
 */
public class A000569 implements Sequence {

  // Using recurrence derived by Barnes and Savage

  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z p(final int n, final int k, final int l, final int s) {
    if (n < 0 || k < 0 || l < 0 || s < 0) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    if (k == 0 || l == 0) {
      return Z.ZERO;
    }
    if (k > n) {
      return p(n, n, l, s);
    }
    if (l > n) {
      return p(n, k, n, s);
    }
    if (s > n) {
      return p(n, k, l, n);
    }
    final String key = n + "_" + k + "_" + l + "_" + s;
    final Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    final Z t = p(n, k - 1, l, s)
      .add(p(n, k, l - 1, s))
      .subtract(p(n, k - 1, l - 1, s))
      .add(p(n - k - l + 1, k - 1, l - 1, s + l - k - 1));
    mCache.put(key, t);
    return t;
  }

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return p(mN, mN, mN, 0);
  }
}
