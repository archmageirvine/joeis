package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067143 extends Sequence1 {

  private long mN = 4;
  private Z mPhi = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mPhi;
      mPhi = Euler.phi(++mN);
      if (mPhi.equals(s.multiply(3))) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
