package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicArray;

/**
 * A064812 Smallest prime p such that the infinite sequence {p, p'=2p-1, p''=2p'-1, ...} begins with a string of exactly n primes.
 * @author Sean A. Irvine
 */
public class A064812 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mChainLength = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    ++mChainLength;
    while (mFirst.get(mChainLength) == null) {
      mP = mPrime.nextPrime(mP);
      // Run forwards to determine chain length
      int length = 0;
      Z r = mP;
      do {
        ++length;
        r = r.multiply2().subtract(1);
      } while (r.isProbablePrime());
      if (mFirst.get(length) == null) {
        mFirst.set(length, mP);
      }
    }
    return mFirst.get(mChainLength);
  }
}

