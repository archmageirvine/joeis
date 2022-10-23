package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034591 Numbers whose concatenation with the next prime yields a prime.
 * @author Sean A. Irvine
 */
public class A034591 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (new Z(++mN + String.valueOf(mPrime.nextPrime(mN))).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
