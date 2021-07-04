package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046959 Numbers k where sin(k) increases monotonically to 1 (or cosec(k) decreases).
 * @author Sean A. Irvine
 */
public class A046959 implements Sequence {

  private CR mBest = CR.valueOf(-1);
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final CR sin = CR.valueOf(++mN).sin();
      if (sin.compareTo(mBest) > 0) {
        mBest = sin;
        return Z.valueOf(mN);
      }
    }
  }
}
