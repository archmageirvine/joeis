package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicLongArray;

/**
 * A055108 Largest odd number that can be represented in exactly n ways as p+2*i^2 where p is 1 or a prime and i &gt;= 0.
 * @author Sean A. Irvine
 */
public class A055108 extends Sequence0 {

  // Uses a heuristic. Any failure will eventually be detected.

  private static final long HEURISTIC_FACTOR = 10;
  private final DynamicLongArray mA = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = -1;
  private long mM = 5991;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0 || mA.get(mN) * HEURISTIC_FACTOR > mM) {
      mM += 2;
      int cnt = 0;
      for (long k = 0, j; (j = mM - 2 * k * k) > 0; ++k) {
        if (mPrime.isPrime(j)) {
          ++cnt;
        }
      }
      if (cnt < mN) {
        throw new RuntimeException("Heuristic failure detected: a(" + cnt + ") >= " + mM);
      }
      mA.set(cnt, mM);
    }
    return Z.valueOf(mA.get(mN));
  }
}
