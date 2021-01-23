package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003594;

/**
 * A025721 Index of 7^n within sequence of numbers of form 3^i*7^j.
 * @author Sean A. Irvine
 */
public class A025721 extends A003594 {

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
