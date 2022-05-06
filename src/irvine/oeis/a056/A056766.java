package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056766 Smallest term of A056757 (numbers for which the cube of the number of divisors exceeds the number) between 2^(n-1) and 2^n.
 * @author Sean A. Irvine
 */
public class A056766 extends A056757 {

  private Z mN = null;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    while (mA.compareTo(mN) <= 0) {
      mA = super.next();
    }
    return mA;
  }
}
