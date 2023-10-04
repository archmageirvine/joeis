package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A065369 Replace 3^k with (-3)^k in ternary expansion of n.
 * @author Georg Fischer
 */
public class A065369 extends AbstractSequence {

  private int mN;
  private int mDigit;

  /** Construct the sequence. */
  public A065369() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param digit
   */
  public A065369(final int offset, final int digit) {
    super(offset);
    mN = offset - 1;
    mDigit = digit;
  }

  @Override
  public Z next() {
    long n = ++mN;
    long s = 0;
    long m = 1;
    while (n > 0) {
      s += m * (n % mDigit);
      n /= mDigit;
      m *= -mDigit;
    }
    return Z.valueOf(s);
  }
}
