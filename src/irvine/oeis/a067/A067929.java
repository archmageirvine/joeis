package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067851.
 * @author Sean A. Irvine
 */
public class A067929 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Euler.phi(++mN);
      mSum = mSum.signedAdd((mN & 1) == 1, phi);
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
