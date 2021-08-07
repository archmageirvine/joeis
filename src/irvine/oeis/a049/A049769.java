package irvine.oeis.a049;

import irvine.math.LongUtils;

/**
 * A049769 Triangular array T read by rows: T(n,k) = (k^3 mod n) + (n^3 mod k).
 * @author Sean A. Irvine
 */
public class A049769 extends A049765 {

  @Override
  protected long t(final long n, final long m) {
    return LongUtils.modPow(n, 3, m) + LongUtils.modPow(m, 3, n);
  }
}
