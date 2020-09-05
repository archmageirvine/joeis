package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034817 Concatenations C1 and C2 and C3 are all prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034817 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 61;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String mid = String.valueOf(mN);
      final String prev = String.valueOf(mPrime.prevPrime(mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      if (new Z(prev + mid).isProbablePrime()
        && new Z(mid + next).isProbablePrime()
        && new Z(prev + mid + next).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
