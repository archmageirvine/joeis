package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A073885 a(1)=1, a(n) = smallest positive integer not included earlier such that the n-th partial sum is a prime iff n is a prime.
 * @author Sean A. Irvine
 */
public class A073885 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mSum = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final boolean isPrime = mPrime.isPrime(mN);
    long k = 1;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mSum.add(k);
        if (isPrime == t.isProbablePrime()) {
          mUsed.set(k);
          mSum = t;
          return Z.valueOf(k);
        }
      }
    }
  }
}
