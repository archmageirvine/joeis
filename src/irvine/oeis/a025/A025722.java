package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025722 Index of 7^n within sequence of numbers of form 4^i*7^j.
 * @author Sean A. Irvine
 */
public class A025722 extends A025619 {

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
