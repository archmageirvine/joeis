package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000037;

/**
 * A081650 Least nonsquare whose remainder modulo k^2 is a square for all 0 &lt; k &lt;= n.
 * @author Sean A. Irvine
 */
public class A081650 extends Sequence1 {

  private final Sequence mA = new A000037();
  private Z mM = mA.next();
  private long mN = 0;

  private boolean is(final long n, final Z m) {
    for (long k = 1; k <= n; ++k) {
      if (!Predicates.SQUARE.is(m.mod(k * k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mN, mM)) {
      mM = mA.next();
    }
    return mM;
  }
}
