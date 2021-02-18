package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a038.A038133;

/**
 * A039507 Number of odd non-cluster primes less than 10^n.
 * @author Sean A. Irvine
 */
public class A039507 extends A038133 {

  private long mCount = 0;
  private Z mLim = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mLim) >= 0) {
        mLim = mLim.multiply(10);
        return Z.valueOf(mCount++);
      }
      ++mCount;
    }
  }
}
