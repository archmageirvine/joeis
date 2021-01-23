package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025703 Index of 4^n within sequence of numbers of form 4^i*6^j.
 * @author Sean A. Irvine
 */
public class A025703 extends A025618 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.shiftLeft(2);
    return Z.valueOf(mN);
  }
}
