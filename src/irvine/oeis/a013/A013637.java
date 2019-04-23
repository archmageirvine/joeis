package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013637 <code>n*prevprime(n)</code>.
 * @author Sean A. Irvine
 */
public class A013637 implements Sequence {

  private Prime mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(++mN)).multiply(mN);
  }
}
