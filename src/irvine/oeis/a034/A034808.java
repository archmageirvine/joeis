package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034808 Concatenation of 'prevprime(n) and n' is a prime.
 * @author Sean A. Irvine
 */
public class A034808 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (new Z(mPrime.prevPrime(++mN) + String.valueOf(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
