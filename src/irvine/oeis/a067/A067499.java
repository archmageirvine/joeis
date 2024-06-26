package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067499 Powers of 2 with digit sum also a power of 2.
 * @author Georg Fischer
 */
public class A067499 extends AbstractSequence {

  private final int mBase;
  private Z mPow;

  /** Construct the sequence. */
  public A067499() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param base base and divisor
   */
  public A067499(final int offset, final int base) {
    super(offset);
    mPow = Z.ONE;
    mBase = base;
  }

  /**
   * Test the condition.
   * @return true (false) if the condition is (not) fulfilled.
   */
  protected boolean condition() {
    final long sum = Functions.DIGIT_SUM.l(mPow);
    long prod = 1;
    while (prod < sum) {
      prod *= mBase;
    }
    return prod == sum;
  }

  @Override
  public Z next() {
    while (!condition()) {
      mPow = mPow.multiply(mBase);
    }
    final Z result = mPow;
    mPow = mPow.multiply(mBase);
    return result;
  }
}
