package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049857 Concatenate prevprime(n), n, and nextprime(n).
 * @author Sean A. Irvine
 */
public class A049857 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return new Z(String.valueOf(mPrime.prevPrime(++mN)) + mN + mPrime.nextPrime(mN));
  }
}
