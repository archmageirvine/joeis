package irvine.oeis.a137;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A137331 a(n) = 1 if the binary weight of n is prime, otherwise 0.
 * @author Sean A. Irvine
 */
public class A137331 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return mPrime.isPrime(Long.bitCount(++mN)) ? Z.ONE : Z.ZERO;
  }
}
