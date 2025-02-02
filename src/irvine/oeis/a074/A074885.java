package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A074885 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    long k = 0;
    while (++k * k < n) {
      if (!Predicates.SQUARE_FREE.is(n - k * k)) {
        return false;
      }
    }
    return true;
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
