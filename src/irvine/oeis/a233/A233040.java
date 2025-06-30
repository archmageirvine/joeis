package irvine.oeis.a233;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A233040 Prime(n), where n is such that (1 + Sum_{i=1..n} prime(i)^7) / n is an integer.
 * @author Georg Fischer
 */
public class A233040 extends AbstractSequence {

  private final int mFirst;
  private final int mPower;
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ONE;
  private Z mSum;
  private long mN = 0;

  /** Construct the sequence. */
  public A233040() {
    this(1, 1, 7);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param first add this to the sum
   * @param power exponent
   */
  public A233040(final int offset, final int first, final int power) {
    super(offset);
    mN = 0;
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
        return mPrev;
      }
    }
  }
}
