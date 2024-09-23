package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072299 Numbers k such that reverse(k) is a prime factor of k.
 * @author Sean A. Irvine
 */
public class A072299 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      if (mN % r == 0 && mPrime.isPrime(r)) {
        return Z.valueOf(mN);
      }
    }
  }
}

