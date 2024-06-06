package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056763 Number of integers in the range (2^(n-1), 2^n] for which d(k)^3 &gt; k holds, i.e., the cube of the number of divisors of k exceeds the number k.
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
