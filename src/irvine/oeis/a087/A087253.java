package irvine.oeis.a087;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a025.A025586;

/**
 * A087253 Number of distinct initial values of various 3x+1 trajectories of which the peak-value equals 4n.
 * @author Sean A. Irvine
 */
public class A087253 extends A025586 {

  private final HashMap<Z, Long> mSeen = new HashMap<>();

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      if (m.mod(4) == 0) {
        mSeen.merge(m, 1L, Long::sum);
      }
      if (mN.mod(4) == 0) {
        final Long res = mSeen.remove(mN);
        return res == null ? Z.ZERO : Z.valueOf(res);
      }
    }
  }
}

