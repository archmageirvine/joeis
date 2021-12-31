package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025699 Index of 3^n within sequence of numbers of form 3^i*8^j (A025615).
 * @author Sean A. Irvine
 */
public class A025699 extends A025615 {

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
