package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005171 0 if n is prime else 1.
 * @author Sean A. Irvine
 */
public class A005171 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ZERO : Z.ONE;
  }
}

