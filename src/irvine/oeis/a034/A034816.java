package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034816 Concatenations C1 and C2 are both prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034816 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String mid = String.valueOf(mN);
      if (new Z(mPrime.prevPrime(mN) + mid).isProbablePrime()
        && new Z(mid + mPrime.nextPrime(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
