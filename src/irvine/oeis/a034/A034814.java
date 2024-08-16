package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034814 Concatenations C1 and C2 are both prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034814 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final String prev = String.valueOf(mPrime.prevPrime(mN));
      final String mid = String.valueOf(mN);
      if (new Z(prev + mid).isProbablePrime()
        && new Z(mid + prev).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
