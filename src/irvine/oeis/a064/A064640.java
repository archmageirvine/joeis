package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A064640 Positions of non-crossing fixed-point-free involutions (encoded by A014486) in A055089, sorted to ascending order.
 * @author Sean A. Irvine
 */
public class A064640 extends A064638 implements Conjectural {

  private static final int HEURISITC_STEPS = 10;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    for (int k = 0; k < HEURISITC_STEPS; ++k) {
      final Z t = super.next();
      if (t.compareTo(mPrev) < 0) {
        throw new RuntimeException("Heuristic failed: " + t + " should have been output earlier");
      }
      mA.add(t);
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
