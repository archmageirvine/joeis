package irvine.oeis.a066;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066938 Primes of the form p*q+p+q, where p and q are primes.
 * @author Sean A. Irvine
 */
public class A066938 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mP.multiply(3).compareTo(mA.first()) < 0) {
      final long p = mP.longValue();
      for (long q = 2; q <= p; q = mPrime.nextPrime(q)) {
        final Z t = mP.multiply(q + 1).add(q);
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
      mP = mPrime.nextPrime(mP);
    }
    return mA.pollFirst();
  }
}
