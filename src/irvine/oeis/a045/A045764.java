package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A045764 n + 1 - d(n) - phi(n) never takes these values (conjecture).
 * @author Sean A. Irvine
 */
public class A045764 extends A045763 {

  // Heuristic, any failure will eventually be detected and reported

  private static final long HEURISTIC = 50;
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private final TreeSet<Z> mOutput = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      for (long j = 0; j < HEURISTIC * mN.bitLength(); ++j) {
        final Z t = super.next();
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
