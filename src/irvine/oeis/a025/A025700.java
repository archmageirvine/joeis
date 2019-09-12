package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025700 Index of <code>3^n</code> within sequence of numbers of form <code>3^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025700 extends A025616 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(3);
    return Z.valueOf(mN);
  }
}
