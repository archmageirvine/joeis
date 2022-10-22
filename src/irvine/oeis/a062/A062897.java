package irvine.oeis.a062;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062897 Number and its reversal are both multiples of 2.
 * @author Georg Fischer
 */
public class A062897 extends AbstractSequence {

  private long mN;
  private final long mMult;

  /** Construct the sequence. */
  public A062897() {
    this(1, 1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start first number to be checked for the condition
   * @param mult multiple
   */
  public A062897(final int offset, final int start, final int mult) {
    super(offset);
    mN = start - 1;
    mMult = mult;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN % mMult == 0 && LongUtils.reverse(mN) % mMult == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
