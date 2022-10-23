package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058008 Numbers k such that (2*k - 1)!/(k!)^2 is an integer.
 * @author Sean A. Irvine
 */
public class A058008 extends Sequence1 {

  private Q mF = Q.ONE;
  private long mN = 0;


  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(2 * mN - 1).multiply(2 * mN - 2).divide(mN).divide(mN);
      }
      if (mF.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
