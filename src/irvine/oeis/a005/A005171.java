package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A005171 Characteristic function of nonprimes: 0 if n is prime, else 1.
 * @author Sean A. Irvine
 */
public class A005171 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ZERO : Z.ONE;
  }

  @Override
  public Z a(final Z n) {
    return n.isProbablePrime() ? Z.ZERO : Z.ONE;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

