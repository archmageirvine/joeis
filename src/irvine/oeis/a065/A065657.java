package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065657 Numbers n divided by EulerPhi(n) in approximately the golden ratio, i.e., n minimizing |(k / EulerPhi(k)) - golden ratio phi| for numbers k with the same number of digits as n.
 * @author Sean A. Irvine
 */
public class A065657 extends Sequence1 {

  private static final int HEURISTIC_ACCURACY = -500;
  private final TreeSet<Long> mA = new TreeSet<>();
  private long mLimit = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLimit *= 10;
      CR best = CR.PHI;
      for (long k = mLimit / 10; k < mLimit; ++k) {
        final CR t = CR.PHI.subtract(CR.valueOf(new Q(k, Functions.PHI.l(k)))).abs();
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
    return Z.valueOf(mA.pollFirst());
  }
}
