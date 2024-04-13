package irvine.oeis.a106;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A106754 Primes p with digital sum equal to 11.
 * @author Georg Fischer
 */
public class A106754 extends A000040 {

  private final int mDigitSum;

  /** Construct the sequence. */
  public A106754() {
    this(11);
  }

  /**
   * Generic constructor with parameter
   * @param digitSum desired sum of the digits
   */
  public A106754(final int digitSum) {
    mDigitSum = digitSum;
  }

  @Override
  public Z next() {
    Z prime = super.next();
    while (Functions.DIGIT_SUM.l(prime) != mDigitSum) {
      prime = super.next();
    }
    return prime;
  }
}
