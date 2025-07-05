package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078583 extends A000040 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (mA.subtract(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

