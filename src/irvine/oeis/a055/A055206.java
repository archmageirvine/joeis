package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a006.A006562;

/**
 * A055206 Number of balanced, adequate or average primes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A055206 extends A006562 {

  private long mLimit = 1;
  private long mCount = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    while (super.next().longValueExact() < mLimit) {
      ++mCount;
    }
    return Z.valueOf(mCount++);
  }
}
