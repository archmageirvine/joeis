package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025692 Index of <code>2^n</code> within sequence of numbers of form <code>2^i*6^j</code>.
 * @author Sean A. Irvine
 */
public class A025692 extends A025610 {

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
