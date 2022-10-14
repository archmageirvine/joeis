package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A238938 Powers of 2 without the digit '0' in their decimal expansion.
 * @author Georg Fischer
 */
public class A238938 implements SequenceWithOffset {

  private int mN;
  private int mOffset;
  private Z mBase;

  /** Construct the sequence. */
  public A238938() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param base
   */
  public A238938(final int offset, final int base) {
    mOffset = offset;
    mBase = Z.valueOf(base);
    mN = -1;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      final Z result = mBase.pow(++mN);
      if (!result.toString().contains("0")) {
        return result;
      }
    }
  }
}
