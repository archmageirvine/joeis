package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056767 Largest number of binary size n (i.e., between (n-1)-th and n-th powers of 2) with the following property: cube of its number of divisors is larger than the number itself.
 * @author Sean A. Irvine
 */
public class A056767 extends A056757 {

  private Z mN = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    Z t = mA;
    while (mA.compareTo(mN) <= 0) {
      t = mA;
      mA = super.next();
    }
    return t;
  }
}
