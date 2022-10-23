package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013634 a(n) = nextprime(n) + n.
 * @author Sean A. Irvine
 */
public class A013634 extends Sequence0 {

  private Prime mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.nextPrime(++mN) + mN);
  }
}
