package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025711 Index of 5^n within sequence of numbers of form 5^i*10^j.
 * @author Sean A. Irvine
 */
public class A025711 extends A025625 {

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
