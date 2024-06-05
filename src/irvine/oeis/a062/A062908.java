package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062908 Non-palindromic number and its reversal are both even.
 * @author Georg Fischer
 */
public class A062908 extends AbstractSequence {

  private int mN;
  private final int mMult;

  /** Construct the sequence. */
  public A062908() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param mult multiple
   */
  public A062908(final int offset, final int mult) {
    super(offset);
    mN = -1;
    mMult = mult;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long nm = Functions.REVERSE.l(mN);
      if (mN != nm && mN % mMult == 0 && Functions.REVERSE.l(mN) % mMult == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
