package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A013635 a(n) = prevprime(n) + n.
 * @author Sean A. Irvine
 */
public class A013635 extends Sequence3 {

  private Prime mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(++mN) + mN);
  }
}
