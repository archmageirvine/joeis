package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005209 Multilevel sieve: at k-th step, accept k numbers, reject <code>k,</code> accept <code>k, ..</code>.
 * @author Sean A. Irvine
 */
public class A005209 implements Sequence {

  // After Tom Duff

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    for (long k = mN - 1; k >= 1; --k) {
      m = m.multiply2().subtract(m.subtract(1).mod(k) + 1);
    }
    return m;
  }
}
