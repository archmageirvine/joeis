package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062861 Numbers which are sums of squares of consecutive numbers (possibly including squares of negative numbers).
 * @author Sean A. Irvine
 */
public class A062861 extends Sequence0 {

  private long mN = -1;

  private boolean is(final long t) {
    if (t <= 2) {
      return true;
    }
    for (final Z k : Jaguar.factor(6 * t).divisorsSorted()) {
      final Q z = new Q(k.square().subtract(1), Z.THREE);
      final Q u = new Q(Z.valueOf(4 * t), k);
      final Q r = u.subtract(z);
      if (r.isInteger() && r.toZ().isSquare()) {
        return true;
      }
      if (z.compareTo(u) > 0) {
        break;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
