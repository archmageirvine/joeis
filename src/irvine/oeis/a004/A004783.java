package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004783.
 * @author Sean A. Irvine
 */
public class A004783 implements Sequence {

  private Q mA = Q.THREE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 2) {
        mA = mA.multiply(2 * mN - 4).multiply(2 * mN - 5).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

