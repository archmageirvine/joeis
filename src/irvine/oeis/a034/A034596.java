package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034596 a(n) preceded and followed by nextprime(a(n)) is a prime.
 * @author Sean A. Irvine
 */
public class A034596 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String p = String.valueOf(mPrime.nextPrime(++mN));
      if (new Z(p + mN + p).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
