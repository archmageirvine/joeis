package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004677.
 * @author Sean A. Irvine
 */
public class A004677 implements Sequence {

  private long mN = 0;
  private Q mA = Q.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3 * mN - 3).multiply(3 * mN - 4).multiply(3 * mN - 5).multiply(2)
        .divide(2 * mN).divide(2 * mN - 1).divide(mN - 1).divide(mN - 1).divide(mN - 1);
    }
    return mA.num();
  }
}

