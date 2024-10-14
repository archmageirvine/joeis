package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072599.
 * @author Sean A. Irvine
 */
public class A072599 extends A000040 {

  private long mN = 0;
  private Z mF2 = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF2 = mF2.multiply(++mN * mN);
      if (mF2.subtract(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
