package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065800 Numbers k which, for some r, are r-digit maximizers of k/phi(k).
 * @author Sean A. Irvine
 */
public class A065800 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mLimit = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLimit *= 10;
      Q best = Q.ZERO;
      for (long k = mLimit / 10; k < mLimit; ++k) {
        final Q r = new Q(k, Functions.PHI.l(k));
        final int c = r.compareTo(best);
        if (c >= 0) {
          if (c > 0) {
            mA.clear();
            best = r;
          }
          mA.add(k);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
