package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025739 Index of 9^n within the sequence of the numbers of the form 9^i*10^j.
 * @author Sean A. Irvine
 */
public class A025739 extends A025635 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mA.equals(super.next()));
    mA = mA.multiply(9);
    return Z.valueOf(mN);
  }
}
