package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005446.
 * @author Sean A. Irvine
 */
public class A005446 extends MemoryFunction1<Q> implements Sequence {

  protected int mN = -1;

  @Override
  protected Q compute(final int n) {
    if (n <= 1) {
      return Q.ONE;
    }
    Q res = get(n - 1).divide(n + 1);
    for (int k = 2; k <= n / 2; ++k) {
      res = res.subtract(get(k).multiply(get(n + 1 - k)));
    }
    if ((n & 1) == 1) {
      final int m = (n + 1) / 2;
      res = res.subtract(get(m).multiply(get(m)).divide(Q.TWO));
    }
    return res;
  }

  @Override
  public Z next() {
    return get(++mN).den();
  }
}
