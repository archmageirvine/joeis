package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;
import irvine.util.array.LongDynamicIntArray;

/**
 * A022447 Fractal sequence of the dispersion of the primes.
 * @author Sean A. Irvine
 */
public class A022447 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final Sequence mPrimePiSeq = new A000720();
  private final LongDynamicIntArray mPi = new LongDynamicIntArray();
  private long mN = 0;
  {
    // filler for 0th position
    mPi.set(0, 0);
  }

  private int primePi(final long n) {
    while (n >= mPi.length()) {
      mPi.set(mPi.length(), mPrimePiSeq.next().intValueExact());
    }
    return mPi.get(n);
  }

  @Override
  public Z next() {
    long m = ++mN;
    while (mPrime.isPrime(m)) {
      m = primePi(m);
    }
    return Z.valueOf(m - primePi(m));
  }
}
