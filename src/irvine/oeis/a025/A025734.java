package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025734 Index of 9^n within sequence of numbers of form 2^i*9^j.
 * @author Sean A. Irvine
 */
public class A025734 extends A025611 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(9);
    return Z.valueOf(mN);
  }
}
