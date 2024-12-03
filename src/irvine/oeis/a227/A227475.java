package irvine.oeis.a227;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A227475 Cubes which are sum of three consecutive primes.
 * @author Sean A. Irvine
 */
public class A227475 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mCubes = new A000578().skip(2);

  @Override
  public Z next() {
    while (true) {
      final Z c = mCubes.next();
      final Z c3 = c.divide(3);
      if (mPrime.isPrime(c3) && c3.add(mPrime.prevPrime(c3)).add(mPrime.nextPrime(c3)).equals(c)) {
        return c;
      }
      final Z p = mPrime.prevPrime(c3);
      final Z q = mPrime.nextPrime(p);
      if (p.add(q).add(mPrime.nextPrime(q)).equals(c)) {
        return c;
      }
      if (mPrime.prevPrime(p).add(p).add(q).equals(c)) {
        return c;
      }
    }
  }
}
