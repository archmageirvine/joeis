package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A007500 Primes whose reversal in base 10 is also prime (called "palindromic primes" by D. Wells, although that name usually refers to A002385). Also called reversible primes.
 * @author Georg Fischer
 */
public class A007500 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private int mBase;

  /** Construct the sequence. */
  public A007500() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A007500(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(ZUtils.reverse(mP, mBase))) {
        return mP;
      }
    }
  }
}
