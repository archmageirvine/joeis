package irvine.oeis.a087;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A087286 Possible differences between a square and the closest smaller cube.
 * @author Sean A. Irvine
 */
public class A087286 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 100;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mPrev = Z.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    final long t = mReported.size() + 1;
    for (int k = 0; k < HEURISTIC * t * t; ++k) {
      final Z s = Z.valueOf(++mN).square();
      final Z c = Functions.CBRT.z(s.subtract(1)).pow(3);
      final Z d = s.subtract(c);
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

