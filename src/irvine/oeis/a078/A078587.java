package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078587 Largest prime p such that p&lt;n and 2n-p is also prime.
 * @author Sean A. Irvine
 */
public class A078587 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  /** Construct the sequence. */
  public A078587() {
    super(4);
  }

  @Override
  public Z next() {
    long p = ++mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mPrime.isPrime(2 * mN - p)) {
        return Z.valueOf(2 * mN - p);
      }
    }
  }
}

