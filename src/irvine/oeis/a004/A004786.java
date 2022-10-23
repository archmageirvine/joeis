package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004786 6!(2n-7)!/n!(n-1)! is an integer.
 * @author Sean A. Irvine
 */
public class A004786 extends Sequence1 {

  private Q mA = Q.FIVE;
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 4) {
        mA = mA.multiply(2 * mN - 7).multiply(2 * mN - 8).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

