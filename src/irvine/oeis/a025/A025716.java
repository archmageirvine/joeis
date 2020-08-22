package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025716 Index of 6^n within sequence of numbers of form 6^i*7^j.
 * @author Sean A. Irvine
 */
public class A025716 extends A025626 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(6);
    return Z.valueOf(mN);
  }
}
