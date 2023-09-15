package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065758 Numbers n divided by n - phi(n) in approximately the golden ratio, i.e., n such that for some r, n is an r-digit minimizer of abs(k / (k - EulerPhi(k)) - (golden ratio phi)).
 * @author Sean A. Irvine
 */
public class A065758 extends Sequence1 {

  private static final int HEURISTIC_ACCURACY = -500;
  private final TreeSet<Long> mA = new TreeSet<>();
  private long mLimit = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLimit *= 10;
      CR best = CR.PHI;
      for (long k = mLimit / 10; k < mLimit; ++k) {
        final long co = k - Euler.phiAsLong(k);
        if (co != 0) {
          final CR t = CR.PHI.subtract(CR.valueOf(new Q(k, co))).abs();
          final int c = t.compareTo(best, HEURISTIC_ACCURACY);
          if (c <= 0) {
            if (c < 0) {
              mA.clear();
              best = t;
            }
            mA.add(k);
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
