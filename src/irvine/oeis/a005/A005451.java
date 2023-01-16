package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005451 a(n)=1 if n is a prime number, otherwise a(n)=n.
 * @author Sean A. Irvine
 */
public class A005451 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ONE : Z.valueOf(mN);
  }
}
