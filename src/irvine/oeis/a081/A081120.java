package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A081120 Number of integral solutions to Mordell's equation y^2 = x^3 - n.
 * @author Sean A. Irvine
 */
public class A081120 extends Sequence1 implements Conjectural {

  private long mCubeLimit = 1000;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long x = 0; x < mCubeLimit; ++x) {
      final Z x3 = Z.valueOf(x).pow(3);
      final Z y2 = x3.subtract(mN);
      if (y2.isSquare()) {
        cnt += y2.isZero() ? 1 : 2;
        mCubeLimit = Math.max(mCubeLimit, 100 * x); // Heuristic on how far to search
      }
      if (x != 0) {
        final Z y2m = Z.valueOf(-mN).subtract(x3);
        if (y2m.signum() >= 0 && y2m.isSquare()) {
          cnt += 2;
          mCubeLimit = Math.max(mCubeLimit, 100 * x); // Heuristic on how far to search
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
