package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004787 7!(2n-8)!/n!(n-1)! is an integer.
 * @author Sean A. Irvine
 */
public class A004787 extends Sequence1 {

  private Q mA = new Q(35);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 4) {
        mA = mA.multiply(2 * mN - 8).multiply(2 * mN - 9).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

