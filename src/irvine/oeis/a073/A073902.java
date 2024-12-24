package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073902 Number of n-digit primes with digit sum n.
 * @author Sean A. Irvine
 */
public class A073902 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void search(final Z t, final int remainingValue, final int remainingDigits) {
    if (remainingValue > 9 * remainingDigits || remainingValue < 1) {
      return; // No possible solution
    }
    final Z u = t.multiply(10);
    if (remainingDigits == 1) {
      if ((remainingValue & 1) == 1 && u.add(remainingValue).isProbablePrime()) {
        ++mCount;
      }
      return;
    }
    for (int d = 0; d <= Math.min(9, remainingValue); ++d) {
      search(u.add(d), remainingValue - d, remainingDigits - 1);
    }
  }

  @Override
  public Z next() {
    if (++mN % 3 == 0) {
      return Z.ZERO;
    }
    mCount = 0;
    for (int d = 1; d <= Math.min(9, mN); ++d) {
      search(Z.valueOf(d), mN - d, mN - 1);
    }
    return Z.valueOf(mCount);
  }
}

