package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025733 Index of <code>8^n</code> within sequence of numbers of form <code>8^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025733 extends A025634 {

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
