package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A177855 Divisors of 2^1092 - 1.
 * @author Sean A. Irvine
 */
public class A177855 extends AbstractSequence {

  // This is actually finite but has 178120883699712 terms so you will get sick of waiting
  // for this approach before the finiteness becomes a problem.

  private long mN;
  private Z mNumber;

  /** Construct the sequence. */
  public A177855() {
    this(1, Z.ONE.shiftLeft(1092).subtract(1));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param number enumerate the divisors of this number
   */
  public A177855(final int offset, final Z number) {
    super(offset);
    mN = offset - 1;
    mNumber = number;
  }

  @Override
  public Z next() {
    while (true) {
      if (mNumber.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
