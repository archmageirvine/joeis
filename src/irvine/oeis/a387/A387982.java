package irvine.oeis.a387;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387982 allocated for Johan Lindgren.
 * @author Sean A. Irvine
 */
public class A387982 extends Sequence1 {

  private final HashMap<Long, Long> mCounts = new HashMap<>();
  private long mPrev = 0;
  private long mMax = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long phi = Functions.PHI.l(++mN);
      final long cnt = mCounts.merge(phi, 1L, Long::sum);
//      if (InverseEuler.inversePhi(Z.valueOf(mN)).size() == cnt) {
//        mCounts.remove(phi); // save space, we will never see this phi again
//      }
      if (cnt > mMax) {
        mMax = cnt;
        if (phi != mPrev) {
          mPrev = phi;
          return Z.valueOf(phi);
        }
      }
    }
  }
}

