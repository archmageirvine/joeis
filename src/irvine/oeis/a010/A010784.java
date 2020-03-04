package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010784 Numbers with distinct decimal digits.
 * @author Sean A. Irvine
 */
public class A010784 implements Sequence {

  private long mN = -1;

  private boolean isDistinctDigits(long n) {
    int seen = 0;
    while (n != 0) {
      final int r = 1 << (n % 10);
      if ((seen & r) != 0) {
        return false;
      }
      seen |= r;
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (++mN <= 9876543210L) {
      if (isDistinctDigits(mN)) {
        return Z.valueOf(mN);
      }
    }
    return null;
  }
}
