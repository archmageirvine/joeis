package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A062169 Triangle T(n, k) = k! mod n for n &gt;= 1, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A062169 extends Triangle {

  /** Construct the sequence. */
  public A062169() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  protected Z compute(final int m, final int r) {
    final long n = m + 1;
    final long k = r + 1;
    long f = 1 % n;
    for (long j = 2; j <= k && f != 0; ++j) {
      f *= j;
      f %= n;
    }
    return Z.valueOf(f);
  }
}
