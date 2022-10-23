package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A049857 Concatenate prevprime(n), n, and nextprime(n).
 * @author Sean A. Irvine
 */
public class A049857 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return new Z(String.valueOf(mPrime.prevPrime(++mN)) + mN + mPrime.nextPrime(mN));
  }
}
