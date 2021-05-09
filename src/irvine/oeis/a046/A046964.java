package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046964 Sin(n) decreases monotonically to -1.
 * @author Sean A. Irvine
 */
public class A046964 implements Sequence {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR sin = CR.valueOf(++mN).sin();
      if (sin.compareTo(mBest) < 0) {
        mBest = sin;
        return Z.valueOf(mN);
      }
    }
  }
}
