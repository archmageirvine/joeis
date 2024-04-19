package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013636 n*nextprime(n).
 * @author Sean A. Irvine
 */
public class A013636 extends Sequence0 {

  private final Prime mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.nextPrime(++mN)).multiply(mN);
  }
}
