package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025705 Index of <code>4^n</code> within sequence of numbers of form <code>4^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025705 extends A025621 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.shiftLeft(2);
    return Z.valueOf(mN);
  }
}
