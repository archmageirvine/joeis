package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034813 Concatenations C1 and C2 are both prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034813 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final String prev = String.valueOf(mPrime.prevPrime(++mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      final String mid = String.valueOf(mN);
      if (new Z(prev + mid + next).isProbablePrime()
        && new Z(next + mid + prev).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
