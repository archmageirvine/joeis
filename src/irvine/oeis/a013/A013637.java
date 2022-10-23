package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A013637 n*prevprime(n).
 * @author Sean A. Irvine
 */
public class A013637 extends Sequence3 {

  private Prime mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(++mN)).multiply(mN);
  }
}
