package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034593 Cycle of 3 steps possible for 'concatenate a(n) and nextprime(a(n)) is a prime'.
 * @author Sean A. Irvine
 */
public class A034593 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z a = new Z(++mN + String.valueOf(mPrime.nextPrime(mN)));
      if (a.isProbablePrime()) {
        final Z b = new Z(a + String.valueOf(mPrime.nextPrime(a)));
        if (b.isProbablePrime() && new Z(b + String.valueOf(mPrime.nextPrime(b))).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
