package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004427;

/**
 * A178361 Numbers with rounded up arithmetic mean of digits = 1.
 * @author Georg Fischer
 */
public class A178361 extends Sequence1 {

  private int mN;
  private final int mDigit;
  private final A004427 mSeq = new A004427();

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
    mSeq.next(); // skip A004427(0) = 0
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq.next().intValue() == mDigit) {
        return Z.valueOf(mN);
      }
    }
  }
}
