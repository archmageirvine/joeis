package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045765 n - d(n) never takes these values, where d(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A045765 implements Sequence {

  // Heuristic, any failure will eventually be detected and reported

  private static final long HEURISTIC = 50;
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mOutput = new TreeSet<>();
  private long mK = 0;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      for (long j = 0; j < HEURISTIC * mN.bitLength(); ++j) {
        final Z t = Z.valueOf(++mK).subtract(Jaguar.factor(mK).sigma0());
        if (mOutput.contains(t)) {
          throw new RuntimeException("Heuristic failed, previously output " + t + " should not be in the sequence");
        }
        mSeen.add(t);
      }
      mN = mN.add(1);
      if (!mSeen.contains(mN)) {
        mOutput.add(mN);
        return mN;
      }
    }
  }
}
