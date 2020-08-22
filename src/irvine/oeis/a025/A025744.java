package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025744 Index of 10^n within sequence of numbers of form 6^i*10^j.
 * @author Sean A. Irvine
 */
public class A025744 extends A025629 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(10);
    return Z.valueOf(mN);
  }
}
