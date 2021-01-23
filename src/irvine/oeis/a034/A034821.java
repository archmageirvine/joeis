package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034821 Concatenations C1 and C2 are both prime (see the comment lines).
 * @author Sean A. Irvine
 */
public class A034821 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final String prev = String.valueOf(mPrime.prevPrime(++mN));
      final String next = String.valueOf(mPrime.nextPrime(mN));
      if (new Z(next + prev).isProbablePrime()
        && new Z(prev + next).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
