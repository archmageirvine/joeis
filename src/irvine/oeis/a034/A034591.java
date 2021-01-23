package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034591 Numbers n such that concatenation of n and nextprime(n) is a prime.
 * @author Sean A. Irvine
 */
public class A034591 implements Sequence {

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
