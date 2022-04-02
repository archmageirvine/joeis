package irvine.oeis.a109;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A109004 Table of gcd(n,m) read by antidiagonals, n &gt;= 0, m &gt;= 0.
 * @author Georg Fischer
 */
public class A109004 extends Triangle {

  /** Construct the sequence. */
  public A109004() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ZERO : Z.valueOf(LongUtils.gcd(n, k));
  }
}
