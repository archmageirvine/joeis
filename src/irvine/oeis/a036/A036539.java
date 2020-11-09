package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036539 a(n) is the number of numbers k with 2^(n-1) &lt; k &lt;= 2^n having a number of divisors that is a power of 2.
 * @author Sean A. Irvine
 */
public class A036539 extends A036537 {

  private Z mLim = Z.ONE;
  private Z mA = super.next();

  @Override
  public Z next() {
    long count = 0;
    mLim = mLim.multiply2();
    while (mA.compareTo(mLim) <= 0) {
      ++count;
      mA = super.next();
    }
    if (Z.TWO.equals(mLim)) {
      --count; // probably because 1 is not counted as a power of 2 here?
    }
    return Z.valueOf(count);
  }
}
