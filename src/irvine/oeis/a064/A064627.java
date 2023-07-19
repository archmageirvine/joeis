package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A064627 Positive integers not in A064494.
 * @author Sean A. Irvine
 */
public class A064627 extends A064494 implements Conjectural {

  private static final int HEURISTIC_STEPS = 10;
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      for (int k = 0; k < HEURISTIC_STEPS; ++k) {
        final Z t = super.next();
        if (t.compareTo(mPrev) <= 0) {
          throw new RuntimeException("Previously output value " + mPrev + " was potentially incorrect");
        }
        mSeen.add(t);
      }
      mN = mN.add(1);
      if (!mSeen.remove(mN)) {
        mPrev = mN;
        return mN;
      }
    }
  }
}

