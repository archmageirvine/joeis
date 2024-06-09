package irvine.oeis.a070;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A070287.
 * @author Sean A. Irvine
 */
public class A070287 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 1000;
  private final HashSet<Z> mOutput = new HashSet<>(); // Used only to detect failures
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC; ++k) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z lcm = fs.phi().lcm(fs.sigma());
      if (lcm.compareTo(mPrev) > 0) {
        mSeen.add(lcm);
      } else if (!mOutput.contains(lcm)) {
        throw new RuntimeException("Heuristic failed: " + lcm + " should have been output earlier");
      }
    }
    mPrev = mSeen.pollFirst();
    mOutput.add(mPrev);
    return mPrev;
  }
}
