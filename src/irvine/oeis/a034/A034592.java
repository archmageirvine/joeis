package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034592 Cycle of 2 steps possible for 'concatenate a(n) and nextprime(a(n)) is a prime'.
 * @author Sean A. Irvine
 */
public class A034592 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z a = new Z(++mN + String.valueOf(mPrime.nextPrime(mN)));
      if (a.isProbablePrime() && new Z(a + String.valueOf(mPrime.nextPrime(a))).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
