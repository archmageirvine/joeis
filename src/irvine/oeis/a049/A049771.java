package irvine.oeis.a049;

import irvine.math.LongUtils;

/**
 * A049771 Triangular array T read by rows: T(n,k) = (k^4 mod n) + (n^4 mod k).
 * @author Sean A. Irvine
 */
public class A049771 extends A049765 {

  @Override
  protected long t(final long n, final long m) {
    return LongUtils.modPow(n, 4, m) + LongUtils.modPow(m, 4, n);
  }
}
