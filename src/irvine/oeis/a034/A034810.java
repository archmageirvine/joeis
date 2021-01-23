package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034810 Concatenation of 'prevprime(n) and n and nextprime(n)' is a prime.
 * @author Sean A. Irvine
 */
public class A034810 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (new Z(mPrime.prevPrime(++mN) + String.valueOf(mN) + mPrime.nextPrime(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
