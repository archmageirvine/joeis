package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034815 Concatenations C1 and C2 are both prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034815 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String mid = String.valueOf(mN);
      if (new Z(mid + mPrime.prevPrime(mN)).isProbablePrime()
        && new Z(mPrime.nextPrime(mN) + mid).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
