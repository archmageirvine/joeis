package irvine.oeis.a155;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A155716 Numbers of the form N = a^2 + 6b^2 for some positive integers a,b.
 * @author Sean A. Irvine
 */
public class A155716 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    for (long s, y = 1; (s = n - 6 * y * y) > 0; ++y) {
      if (Predicates.SQUARE.is(s)) {
        return true;
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
