package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A308553 Numbers k such that 5^(k+3) + 3^(k+2) + 2^(k+1) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A308553 extends Sequence1 {

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
