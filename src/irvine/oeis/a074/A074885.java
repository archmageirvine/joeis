package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074885 Numbers not of the form x^2 + M*y^2 for integers x &gt; 0, y &gt; 1, M &gt; 0.
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
