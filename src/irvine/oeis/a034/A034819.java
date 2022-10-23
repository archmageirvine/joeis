package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034819 Concatenations C1 and C2 and C3 and C4 are all prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034819 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 49;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String mid = String.valueOf(mN);
      final String prev = String.valueOf(mPrime.prevPrime(mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      if (new Z(next + mid).isProbablePrime()
        && new Z(prev + mid).isProbablePrime()
        && new Z(mid + prev).isProbablePrime()
        && new Z(mid + next).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
