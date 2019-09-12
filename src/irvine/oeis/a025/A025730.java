package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025730 Index of <code>8^n</code> within sequence of numbers of form <code>6^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025730 extends A025627 {

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
