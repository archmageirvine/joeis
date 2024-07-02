package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071113 Numbers k such that the number of terms in the continued fraction for (1 + 1/x)^x equals k for some x.
 * @author Sean A. Irvine
 */
public class A071113 extends Sequence1 {

  private static final int HEURISTIC_SIZE = 50;
  private final TreeSet<Integer> mA = new TreeSet<>();
  private final TreeSet<Integer> mOutput = new TreeSet<>(); // used to detect heuristic failure
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      while (mA.size() < HEURISTIC_SIZE) {
        mA.add(ContinuedFractionUtils.continuedFraction(Q.ONE.add(new Q(1, ++mN)).pow(mN)).size());
      }
      final int res = mA.pollFirst();
      if (!mOutput.isEmpty() && res < mOutput.last() && mOutput.add(res)) {
        throw new RuntimeException("Heuristic failed: " + res + " is a term");
      }
      if (mOutput.add(res)) {
        return Z.valueOf(res);
      }
    }
  }
}
