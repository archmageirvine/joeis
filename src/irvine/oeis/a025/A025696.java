package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025696 Index of <code>3^n</code> within sequence of numbers of form <code>3^i*4^j</code>.
 * @author Sean A. Irvine
 */
public class A025696 extends A025613 {

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
