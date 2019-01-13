package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004785.
 * @author Sean A. Irvine
 */
public class A004785 implements Sequence {

  private Q mA = new Q(10);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 3) {
        mA = mA.multiply(2 * mN - 6).multiply(2 * mN - 7).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

