package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085515 Order of first occurrence of a sequence of exactly n consecutive primes of the form 6*k+1.
 * @author Sean A. Irvine
 */
public class A085515 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();

  @Override
  public Z next() {
    while (true) {
      int run = 0;
      while (true) {
        mP = mPrime.nextPrime(mP);
        if (mP % 6 != 1) {
          break;
        }
        ++run;
      }
      if (run > 0 && !mSeen.isSet(run)) {
        mSeen.set(run);
        return Z.valueOf(run);
      }
    }
  }
}
