package irvine.oeis.a128;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A128171 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^7.
 * @author Sean A. Irvine
 */
public class A128171 extends AbstractSequence {

  private final int mFirst;
  private final int mPower;
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ONE;
  private Z mSum;
  private long mN = -1;

  /** Construct the sequence. */
  public A128171() {
    this(1, 1, 7);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param first add this to the sum
   * @param power exponent
   */
  public A128171(final int offset, final int first, final int power) {
    super(offset);
    mN = offset - 1;
    mFirst = first;
    mPower = power;
    mSum = start();
  }

  protected Z start() {
    return Z.valueOf(mFirst);
  }

  protected int power() {
    return mPower;
  }

  @Override
  public Z next() {
    while (true) {
      mPrev = mPrime.nextPrime(mPrev);
      mSum = mSum.add(mPrev.pow(power()));
      if (mSum.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
