package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A065122 a(1) = 2; a(n) is smallest prime &gt; 10*a(n-1).
 * @author Georg Fischer
 */
public class A065122 implements Sequence {

  private int mN;
  private Z mA;
  private int mFactor;
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
    mN = 0;
    mA = Z.valueOf(start);
    mFactor = factor;
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mA;
    mA = mPrime.nextPrime(mA.multiply(mFactor));
    return result;
  }
}
