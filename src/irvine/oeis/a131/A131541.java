package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.DynamicByteArray;

/**
 * A131541 Exponent of least power of 2 having exactly n consecutive 7's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131541 extends AbstractSequence {

  private final int mDigit;
  private long mN;
  private DynamicByteArray mBuf = null;

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A131541(final int offset, final int digit) {
    super(offset);
    mDigit = digit;
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A131541() {
    this(1, 7);
  }

  private void mul2() {
    // Base 10 multiply by 2 in mBuf, in place, lsb in byte 0
    int carry = 0;
    for (int k = 0; k < mBuf.length(); ++k) {
      int sum = 2 * mBuf.get(k) + carry;
      if (sum >= 10) {
        carry = 1;
        sum -= 10;
      } else {
        carry = 0;
      }
      mBuf.set(k, (byte) sum);
    }
    if (carry != 0) {
      mBuf.set(mBuf.length(), (byte) 1);
    }
  }

  private boolean bingo() {
    final int d = mDigit;
    int c = 0;
    for (int k = 0; k < mBuf.length(); ++k) {
      if (mBuf.get(k) == d) {
        ++c;
      } else if (c == mN) {
        return true;
      } else {
        c = 0;
      }
    }
    return c == mN;
  }

  @Override
  public Z next() {
    ++mN;
    int v = 0;
    mBuf = new DynamicByteArray();
    mBuf.set(0, (byte) 1);
    while (!bingo()) {
      mul2();
      ++v;
    }
    return Z.valueOf(v);
  }
}

