package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014960 Integers n such that n divides 24^n - 1.
 * @author Sean A. Irvine
 */
public class A014960 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mT = mT.multiply(24);
        mA = mA.add(mT.multiply(mN));
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
