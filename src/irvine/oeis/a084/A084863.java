package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084863 Number of solutions to n = 2*u^2 + 3*v^2, u*v&gt;0.
 * @author Sean A. Irvine
 */
public class A084863 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long v = 1; 3 * v * v < mN; ++v) {
      final long t = mN - 3 * v * v;
      if ((t & 1) == 0 && Predicates.SQUARE.is(t / 2)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
