package irvine.oeis.a062;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062365.
 * @author Sean A. Irvine
 */
public class A062366 extends Sequence1 {

  private long mN = 0;

  private Z collatzOdd(final Z n) {
    return n.isEven() ? n.makeOdd() : n.multiply(3).add(1).makeOdd();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Q t = new Q(mN);
    do {
      t = new Q(t.num().subtract(t.den()).abs(), collatzOdd(t.num()));
    } while (!t.isInteger());
    return t.toZ();
  }
}
