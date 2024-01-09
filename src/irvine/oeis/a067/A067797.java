package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067797 Numbers k such that phi(k) + phi(k+1) = k+2.
 * @author Sean A. Irvine
 */
public class A067797 extends Sequence1 {

  private long mN = 3;
  private Z mPhi = Euler.phi(4L);

  @Override
  public Z next() {
    while (true) {
      final Z t = mPhi;
      mPhi = Euler.phi(++mN + 1);
      if (mPhi.add(t).equals(Z.valueOf(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
