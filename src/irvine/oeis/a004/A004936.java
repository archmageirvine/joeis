package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004936 Numerator of (binomial(2*n-2,n-1)/n!)^2.
 * @author Sean A. Irvine
 */
public class A004936 implements Sequence {

  private Q mA = Q.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(2).multiply(2 * mN - 3).divide(mN).divide(mN - 1);
    }
    return mA.num().square();
  }
}

