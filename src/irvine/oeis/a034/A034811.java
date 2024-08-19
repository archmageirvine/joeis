package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034811 Concatenation of 'nextprime(k) and k and prevprime(k)' is a prime.
 * @author Sean A. Irvine
 */
public class A034811 extends Sequence1 {

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
