package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A072456 Annihilating primes for A000522.
 * @author Sean A. Irvine
 */
public class A072456 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mA = new A072453();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().isZero() && mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
