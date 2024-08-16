package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A054264 Concatenation of composite numbers between successive primes.
 * @author Sean A. Irvine
 */
public class A054264 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    while (!mPrime.isPrime(++mN)) {
      sb.append(mN);
    }
    return new Z(sb);
  }
}
