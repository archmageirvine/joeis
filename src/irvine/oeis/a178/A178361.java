package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.a004.A004427;

/**
 * A178361 Numbers with rounded up arithmetic mean of digits = 1.
 * @author Georg Fischer
 */
public class A178361 extends A004427 {

  private int mN;
  private int mDigit;

  /** Construct the sequence. */
  public A178361() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param digit
   */
  public A178361(final int digit) {
    mN = 0;
    mDigit = digit;
    super.next(); // skip A004427(0) = 0
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().intValue() == mDigit) {
        return Z.valueOf(mN);
      }
    }
  }
}
