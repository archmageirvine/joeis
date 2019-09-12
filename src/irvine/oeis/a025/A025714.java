package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025714 Index of <code>6^n</code> within sequence of numbers of form <code>4^i*6^j</code>.
 * @author Sean A. Irvine
 */
public class A025714 extends A025618 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(6);
    return Z.valueOf(mN);
  }
}
