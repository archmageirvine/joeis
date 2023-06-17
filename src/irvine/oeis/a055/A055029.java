package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055029 Number of inequivalent Gaussian primes of norm n.
 * @author Sean A. Irvine
 */
public class A055029 extends AbstractSequence {

  /* Construct the sequence. */
  public A055029() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      if ((mN & 3) == 1) {
        return Z.TWO;
      } else if (mN == 2) {
        return Z.ONE;
      } else {
        return Z.ZERO;
      }
    } else {
      final long s = LongUtils.sqrt(mN);
      if (s * s == mN && (s & 3) == 3 && mPrime.isPrime(s)) {
        return Z.ONE;
      }
      return Z.ZERO;
    }
  }
}
