package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079043 a(0)=1, then the fractional part of Pi*a(n) decreases monotonically to zero.
 * @author Sean A. Irvine
 */
public class A079043 extends Sequence0 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR z = CR.PI.multiply(++mN).frac();
      if (z.compareTo(mBest) < 0) {
        mBest = z;
        return Z.valueOf(mN);
      }
    }
  }
}
