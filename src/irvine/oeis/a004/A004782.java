package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004782 <code>2(2n-3)!/n!(n-1)!</code> is an integer.
 * @author Sean A. Irvine
 */
public class A004782 implements Sequence {

  private Q mA = Q.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 2) {
        mA = mA.multiply(2 * mN - 3).multiply(2 * mN - 4).divide(mN).divide(mN - 1);
      }
      if (mA.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

