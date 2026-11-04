package irvine.oeis.a087;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A087285 Possible differences between a cube and the next smaller square.
 * @author Sean A. Irvine
 */
public class A087285 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 100;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mPrev = Z.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISTIC * (mReported.size() + 1); ++k) {
      final Z c = Z.valueOf(++mN).pow(3);
      final Z s = c.subtract(1).sqrt().square();
      final Z d = c.subtract(s);
      final int cmp = d.compareTo(mPrev);
      if (cmp < 0 && mReported.add(d)) {
        throw new RuntimeException(d + " is a term and should have been reported earlier: " + mA.first() + ".." + mA.last() + " (" + mA.size() + " items)");
      }
      if (cmp > 0) {
        mA.add(d);
      }
    }
    mPrev = mA.pollFirst();
    mReported.add(mPrev);
    return mPrev;
  }
}

