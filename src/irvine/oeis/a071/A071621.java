package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060315.
 * @author Sean A. Irvine
 */
public class A071621 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mA = new TreeSet<>();
  private long mP = 2;

  @Override
  public Z next() {
    while (mA.isEmpty() || 2 * mP + 4 < mA.first()) {
      for (long a = 2; a <= mP; a = mPrime.nextPrime(a)) {
        for (long b = 2; b <= mP; b = mPrime.nextPrime(b)) {
          final long ab = a * b;
          for (long c = 2; c <= mP; c = mPrime.nextPrime(c)) {
            final long v = ab + c * mP;
            if (mPrime.isPrime(v)) {
              mA.add(v);
            }
          }
        }
      }
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mA.pollFirst());
  }
}
