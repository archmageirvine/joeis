package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034818 Concatenations C1 and C2 and C3 are all prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034818 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 655;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String mid = String.valueOf(mN);
      final String prev = String.valueOf(mPrime.prevPrime(mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      if (new Z(next + mid).isProbablePrime()
        && new Z(mid + prev).isProbablePrime()
        && new Z(next + mid + prev).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
