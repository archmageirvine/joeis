package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308553 allocated for Mikk Heidemaa.
 * @author Sean A. Irvine
 */
public class A308553 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private Z mC = Z.FIVE.square();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      mB = mB.multiply(3);
      mC = mC.multiply(5);
      if (mC.add(mB).add(mA).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
