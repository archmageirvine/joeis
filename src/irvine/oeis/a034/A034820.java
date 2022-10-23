package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034820 Concatenations C1 and C2 and C3 and C4 are all prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034820 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 16775;

  @Override
  public Z next() {
    while (true) {
      final String mid = String.valueOf(++mN);
      final String prev = String.valueOf(mPrime.prevPrime(mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      if (new Z(next + mid + prev).isProbablePrime()
        && new Z(prev + mid + next).isProbablePrime()
        && new Z(prev + mid + prev).isProbablePrime()
        && new Z(next + mid + next).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
