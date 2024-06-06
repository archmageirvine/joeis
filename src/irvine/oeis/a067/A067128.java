package irvine.oeis.a067;
// manually deris/essent at 2021-12-09 19:40

import irvine.math.z.Z;
import irvine.oeis.a034.A034287;

/**
 * A067128 Ramanujan's largely composite numbers, defined to be numbers m such that d(m) &gt;= d(k) for k = 1 to m-1.
 * Identical to A034287 for the 105834 terms less than 10^150.
 * @author Georg Fischer
 */
public class A067128 extends A034287 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 105834) {
      throw new UnsupportedOperationException();
    }
    return super.next();
  }
}
