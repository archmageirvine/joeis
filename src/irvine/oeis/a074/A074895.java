package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074895 Primes written backwards and sorted.
 * @author Sean A. Irvine
 */
public class A074895 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mP = 2;
  private long mLim = 10;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      while (mP < mLim) {
        mA.add(Functions.REVERSE.z(mP));
        mP = mPrime.nextPrime(mP);
      }
      mLim *= 10;
    }
    return mA.pollFirst();
  }
}
