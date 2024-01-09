package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067796 Numbers k such that phi(k) + phi(k+1) = k.
 * @author Sean A. Irvine
 */
public class A067796 extends Sequence1 {

  private long mN = 13;
  private Z mPhi = Euler.phi(14L);

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z t = mPhi;
      mPhi = Euler.phi(mN + 1);
      if (mPhi.add(t).equals(n)) {
        return n;
      }
    }
  }
}
