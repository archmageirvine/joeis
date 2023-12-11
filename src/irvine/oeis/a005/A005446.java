package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A005446 Denominators of expansion of -W_{-1}(-e^{-1-x^2/2}) where W_{-1} is Lambert W function.
 * @author Sean A. Irvine
 */
public class A005446 extends MemoryFunction1Sequence<Q> {

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
