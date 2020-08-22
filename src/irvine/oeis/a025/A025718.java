package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025718 Index of 6^n within sequence of numbers of form 6^i*9^j.
 * @author Sean A. Irvine
 */
public class A025718 extends A025628 {

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
