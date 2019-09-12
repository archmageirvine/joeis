package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025739 Index of <code>9^n</code> within sequence of numbers of form <code>9^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025739 extends A025635 {

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
