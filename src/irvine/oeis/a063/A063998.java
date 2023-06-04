package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A063998 Nonsquare, composite numbers k such that Sum_{d|k, d &lt; k/d} s_d = k+1, where s_d is either d+1/(k/d) or (1/d)+(k/d).
 * @author Sean A. Irvine
 */
public class A063998 extends A002808 {

  private boolean is(final Z[] div, final Z target, final Q sum, final int pos) {
    final Z d = div[pos];
    if (d.square().compareTo(target) >= 0) {
      return sum.isInteger() && sum.toZ().equals(target.add(1));
    }
    if (is(div, target, sum.add(d).add(new Q(d, target)), pos + 1)) {
      return true;
    }
    return is(div, target, sum.add(new Q(Z.ONE, d)).add(new Q(target, d)), pos + 1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isSquare()) {
        final Z[] div = Jaguar.factor(t).divisorsSorted();
        if (is(div, t, Q.ZERO, 0)) {
          return t;
        }
      }
    }
  }
}
