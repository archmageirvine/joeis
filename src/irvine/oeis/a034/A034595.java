package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034595 Concatenation of 'nextprime(a(n)) and a(n)' and 'a(n) and nextprime(a(n))' are both prime.
 * @author Sean A. Irvine
 */
public class A034595 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String p = String.valueOf(mPrime.nextPrime(++mN));
      if (new Z(mN + p).isProbablePrime() && new Z(p + mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
