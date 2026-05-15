package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084864 Numbers that can be written in the form 2*u^2 + 3*v^2, u*v&gt;0.
 * @author Sean A. Irvine
 */
public class A084864 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long v = 1; 3 * v * v < mN; ++v) {
        final long t = mN - 3 * v * v;
        if ((t & 1) == 0 && Predicates.SQUARE.is(t / 2)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
