package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025741 Index of <code>10^n</code> within sequence of numbers of form <code>3^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025741 extends A025616 {

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
