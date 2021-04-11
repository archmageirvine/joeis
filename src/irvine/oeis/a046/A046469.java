package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046469 Obtainable by applying +, * and exponentiation to its own digits.
 * @author Sean A. Irvine
 */
public class A046469 implements Sequence {

  private static final double LIMIT = 1L << 31;
  private long mN = -1;

  private boolean is(final long target, final long[] v) {
    if (v.length == 1) {
      return v[0] == target;
    }
    // Try each operation at each position -- this will do more work
    // than strictly necessary
    final long[] u = new long[v.length - 1];
    for (int k = 1; k < v.length; ++k) {
      // Copy unchanged portions
      System.arraycopy(v, 0, u, 0, k - 1);
      System.arraycopy(v, k + 1, u, k, v.length - (k + 1));
      // Operations
      u[k - 1] = v[k - 1] + v[k];
      if (u[k - 1] <= target && is(target, u)) {
        return true;
      }
      u[k - 1] = v[k - 1] * v[k];
      if (u[k - 1] >= 0 && u[k - 1] <= target && is(target, u)) {
        return true;
      }
      // Be somewhat careful with overflow on powers!
      final double t = Math.pow(v[k - 1], v[k]);
      if (t < LIMIT) {
        u[k - 1] = (long) t;
        if (u[k - 1] <= target && is(target, u)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean is(final long target, final String s) {
    final long[] v = new long[s.length()];
    for (int k = 0; k < v.length; ++k) {
      v[k] = s.charAt(k) - '0';
    }
    return is(target, v);
  }

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      if (is(mN, s)) {
        return Z.valueOf(mN);
      }
    }
  }
}
