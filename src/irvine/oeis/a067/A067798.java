package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067798 Numbers n such that phi(n)+phi(n+1)=n+1.
 * @author Sean A. Irvine
 */
public class A067798 extends Sequence1 {

  private long mN = 1;
  private Z mPhi = Euler.phi(1L);

  @Override
  public Z next() {
    while (true) {
      final Z t = mPhi;
      mPhi = Euler.phi(++mN);
      if (mPhi.add(t).equals(Z.valueOf(mN))) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
