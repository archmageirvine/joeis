package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072096 Energetic numbers, allowing zero as an exponent.
 * @author Sean A. Irvine
 */
public class A072096 extends Sequence1 {

  private long mN = 23;

  private boolean is(final long n, final String ns, final long sum, final int position, final int parts) {
    if (sum > n) {
      return false;
    }
    if (position == ns.length()) {
      return parts > 1 && sum == n;
    }
    for (int splitPoint = position + 1; splitPoint <= ns.length(); ++splitPoint) {
      final long v = Long.parseLong(ns.substring(position, splitPoint));
      // Try using ^0
      if (is(n, ns, sum + 1, splitPoint, parts + 1)) {
        return true;
      }
      // Try ^k, k >0
      long u = v;
      while (sum + u <= n) {
        if (is(n, ns, sum + u, splitPoint, parts + 1)) {
          return true;
        }
        if (u <= 1) {
          break; // avoid powers of 0
        }
        u *= v;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    return is(n, String.valueOf(n), 0, 0, 0);
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
