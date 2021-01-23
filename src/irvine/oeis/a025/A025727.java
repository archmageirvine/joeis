package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025727 Index of 7^n within sequence of numbers of form 7^i*10^j.
 * @author Sean A. Irvine
 */
public class A025727 extends A025632 {

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
