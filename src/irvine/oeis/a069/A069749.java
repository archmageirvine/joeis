package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a020.A020458;

/**
 * A069749 Number of primes less than 10^n containing only the digits 2 and 3 (A020458).
 * @author Sean A. Irvine
 */
public class A069749 extends A020458 {

  private Z mLimit = Z.TEN;
  private long mCount = -1;

  @Override
  public Z next() {
    ++mCount; // left over from previous iteration
    while (super.next().compareTo(mLimit) <= 0) {
      ++mCount;
    }
    mLimit = mLimit.multiply(10);
    return Z.valueOf(mCount);
  }
}
