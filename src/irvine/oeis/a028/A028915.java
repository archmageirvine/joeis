package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A028915 Take next group of 3 primes, beginning at 7, map final digits to base 4 by 1-&gt;0, 3-&gt;1, 7-&gt;3, 9-&gt;2; convert back to decimal.
 * @author Sean A. Irvine
 */
public class A028915 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 5;

  private int r(final long t) {
    switch ((int) (t % 10)) {
      case 1:
        return 0;
      case 3:
        return 1;
      case 7:
        return 3;
      case 9:
        return 2;
      default:
        throw new RuntimeException();
    }
  }

  @Override
  public Z next() {
    final long a = mPrime.nextPrime(mP);
    final long b = mPrime.nextPrime(a);
    mP = mPrime.nextPrime(b);
    return Z.valueOf((r(a) << 4) + (r(b) << 2) + r(mP));
  }
}
