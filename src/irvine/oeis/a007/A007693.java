package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007693 Primes p such that 6*p + 1 is also prime.
 * @author Sean A. Irvine
 */
public class A007693 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  private long mMul;
  private long mAdd;

  /** Construct the sequence. */
  public A007693() {
    this(6, 1);
  }

  /**
   * Generic constructor with parameters
   * @param mul multiply the prime by this number
   * @param add add this number to the product
   */
  public A007693(final long mul, final long add) {
    mMul = mul;
    mAdd = add;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP.multiply(mMul).add(mAdd))) {
        return mP;
      }
    }
  }
}
