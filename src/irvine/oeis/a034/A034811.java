package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034811 Concatenation of 'nextprime(n) and n and prevprime(n)' is a prime.
 * @author Sean A. Irvine
 */
public class A034811 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (new Z(mPrime.nextPrime(++mN) + String.valueOf(mN) + mPrime.prevPrime(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
