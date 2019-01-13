package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014866.
 * @author Sean A. Irvine
 */
public class A014866 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mA = mA.multiply(16).add(mN);
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
