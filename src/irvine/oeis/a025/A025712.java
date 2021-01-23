package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025712 Index of 6^n within sequence of numbers of form 2^i*6^j.
 * @author Sean A. Irvine
 */
public class A025712 extends A025610 {

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
