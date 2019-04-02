package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013633 nextprime(n) - prevprime(n).
 * @author Sean A. Irvine
 */
public class A013633 implements Sequence {

  private Prime mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.nextPrime(++mN) - mPrime.prevPrime(mN));
  }
}
