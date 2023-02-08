package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061308 Smaller of two consecutive primes whose sum is a cube.
 * @author Sean A. Irvine
 */
public class A061308 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z cube = mN.pow(3);
      final Z prev = mPrime.prevPrime(cube.divide2());
      if (prev.add(mPrime.nextPrime(prev)).equals(cube)) {
        return prev;
      }
    }
  }
}
