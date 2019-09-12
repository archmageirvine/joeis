package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025695 Index of <code>2^n</code> within sequence of numbers of form <code>2^i*10^j</code>.
 * @author Sean A. Irvine
 */
public class A025695 extends A025612 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply2();
    return Z.valueOf(mN);
  }
}
