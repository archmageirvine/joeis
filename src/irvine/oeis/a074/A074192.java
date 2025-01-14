package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a050.A050940;

/**
 * A074192 Number of numbers 0 &lt;= m &lt; 10^n which are not the sum of one or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A074192 extends A050940 {

  private Z mN = Z.ONE;
  private long mCount = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    mN = mN.multiply(10);
    while (mA.compareTo(mN) < 0) {
      mA = super.next();
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
