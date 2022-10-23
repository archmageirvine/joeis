package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034594 Concatenation of nextprime(a(n)) and a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A034594 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(mPrime.nextPrime(++mN)) + mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
