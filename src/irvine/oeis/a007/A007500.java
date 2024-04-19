package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007500 Primes whose reversal in base 10 is also prime (called "palindromic primes" by D. Wells, although that name usually refers to A002385). Also called reversible primes.
 * @author Georg Fischer
 */
public class A007500 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private final int mBase;

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
      if (mPrime.isPrime(Functions.REVERSE.z(mBase, mP))) {
        return mP;
      }
    }
  }
}
