package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025735 Index of 9^n within sequence of numbers of form 5^i*9^j.
 * @author Sean A. Irvine
 */
public class A025735 extends A025624 {

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
