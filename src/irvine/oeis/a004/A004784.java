package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004784 4!(2n-5)!/n!(n-1)! is an integer.
 * @author Sean A. Irvine
 */
public class A004784 extends Sequence1 {

  private Q mA = Q.TWO;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 3) {
        mA = mA.multiply(2 * mN - 5).multiply(2 * mN - 6).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

