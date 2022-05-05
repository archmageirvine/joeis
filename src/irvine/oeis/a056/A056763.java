package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056763 Number of x integers between 2^(n-1) and 2^n for which d(x)^3 &gt; x holds, i.e., cube of number of divisors of x exceeds the number x and binary size of x is n.
 * @author Sean A. Irvine
 */
public class A056763 extends A056757 {

  private Z mN = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.multiply2();
    long cnt = 0;
    while (mA.compareTo(mN) <= 0) {
      ++cnt;
      mA = super.next();
    }
    return Z.valueOf(cnt);
  }
}
