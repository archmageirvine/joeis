package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005537 Numbers n such that 4*3^n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A005537 extends Sequence1 {

  private Z mA = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(3);
      }
      if (mA.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
