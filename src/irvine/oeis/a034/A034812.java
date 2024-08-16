package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034812 Concatenation of 'prevprime(n) and n and prevprime(n)' is a prime.
 * @author Sean A. Irvine
 */
public class A034812 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final String prev = String.valueOf(mPrime.prevPrime(++mN));
      if (new Z(prev + mN + prev).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
