package irvine.oeis.a092;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A092572 Numbers of the form x^2 + 3y^2 where x and y are positive integers.
 * @author Sean A. Irvine
 */
public class A092572 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    for (long s, y = 1; (s = n - 3 * y * y) > 0; ++y) {
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
