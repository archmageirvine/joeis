package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081119 Number of integral solutions to Mordell's equation y^2 = x^3 + n.
 * @author Sean A. Irvine
 */
public class A081119 extends Sequence1 {

  // WARNING: Heuristic do not use to extend the sequence.

  private long mCubeLimit = 1000;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mCubeLimit; ++k) {
      final Z k3 = Z.valueOf(k).pow(3);
      final Z vp = k3.add(mN);
      if (vp.isSquare()) {
        cnt += 2;
        mCubeLimit = Math.max(mCubeLimit, 100 * k); // Heuristic on how far to search
      }
      if (k != 0) {
        final Z vm = Z.valueOf(mN).subtract(k3);
        if (vm.signum() >= 0 && vm.isSquare()) {
          cnt += vm.isZero() ? 1 : 2;
          mCubeLimit = Math.max(mCubeLimit, 100 * k); // Heuristic on how far to search
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
