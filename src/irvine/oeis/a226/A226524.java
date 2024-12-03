package irvine.oeis.a226;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A226524 Cubes which are the sum of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A226524 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mCubes = new A000578().skip(2);

  @Override
  public Z next() {
    while (true) {
      final Z c = mCubes.next();
      final Z p = mPrime.prevPrime(c.divide2());
      if (p.add(mPrime.nextPrime(p)).equals(c)) {
        return c;
      }
    }
  }
}
