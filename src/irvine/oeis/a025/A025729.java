package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025729 Index of 8^n within sequence of numbers of form 5^i*8^j.
 * @author Sean A. Irvine
 */
public class A025729 extends A025623 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.shiftLeft(3);
    return Z.valueOf(mN);
  }
}
