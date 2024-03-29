package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065122 a(1) = 2; a(n) is smallest prime &gt; 10*a(n-1).
 * @author Georg Fischer
 */
public class A065122 extends Sequence1 {

  private Z mA;
  private final int mFactor;
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A065122() {
    this(10, 2);
  }

  /**
   * Generic constructor with parameters
   * @param start value of a(1)
   * @param factor multiply a(n) by this factor
   */
  public A065122(final int factor, final int start) {
    mA = Z.valueOf(start);
    mFactor = factor;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mPrime.nextPrime(mA.multiply(mFactor));
    return result;
  }
}
