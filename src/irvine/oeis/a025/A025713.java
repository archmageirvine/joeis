package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025713 Index of 6^n within sequence of numbers of form 3^i*6^j.
 * @author Sean A. Irvine
 */
public class A025713 extends A025614 {

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
