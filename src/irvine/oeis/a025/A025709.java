package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025709 Index of <code>5^n</code> within sequence of numbers of form <code>5^i*8^j</code>.
 * @author Sean A. Irvine
 */
public class A025709 extends A025623 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(5);
    return Z.valueOf(mN);
  }
}
