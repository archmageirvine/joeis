package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a036.A036566;

/**
 * A025725 Index of <code>7^n</code> within sequence of numbers of form <code>7^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025725 extends A036566 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(7);
    return Z.valueOf(mN);
  }
}
