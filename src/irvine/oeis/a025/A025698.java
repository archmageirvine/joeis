package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003594;

/**
 * A025698 Index of <code>3^n</code> within sequence of numbers of form <code>3^i*7^j</code>.
 * @author Sean A. Irvine
 */
public class A025698 extends A003594 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(3);
    return Z.valueOf(mN);
  }
}
