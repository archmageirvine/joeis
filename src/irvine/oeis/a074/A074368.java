package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A074368 Rearrangement of odd numbers such that a(k) + a(k+1) + 1 is a prime for all k.
 * @author Sean A. Irvine
 */
public class A074368 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
    } else {
      long k = 0;
      while (true) {
        if (!mUsed.isSet(++k) && mPrime.isPrime(mN + 2 * k + 2)) {
          mUsed.set(k);
          mN = 2 * k + 1;
          break;
        }
      }
    }
    return Z.valueOf(mN);
  }
}
