package irvine.oeis.a062;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A062292.
 * @author Sean A. Irvine
 */
public class A062294 extends MemorySequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private final HashSet<Z> mSums = new HashSet<>();

  private boolean isOk(final long prime) {
    for (final Z v : this) {
      if (mSums.contains(v.add(prime))) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isOk(mP)) {
        for (final Z v : this) {
          mSums.add(v.add(mP));
        }
        return Z.valueOf(mP);
      }
    }
  }
}

