package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025715 Index of 6^n in A025622 (numbers of form 5^i*6^j).
 * @author Sean A. Irvine
 */
public class A025715 extends A025622 {

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
