package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013638 a(n) = prevprime(n)*nextprime(n).
 * @author Sean A. Irvine
 */
public class A013638 implements Sequence {

  private final Prime mPrime = new Fast();
  protected long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(mPrime.prevPrime(++mN)).multiply(mPrime.nextPrime(mN));
  }
}
