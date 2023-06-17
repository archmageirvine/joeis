package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.DynamicByteArray;

/**
 * A131541 Least power of 2 having exactly n consecutive 7's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131541 extends AbstractSequence {

  /** Construct the sequence. */
  public A131541() {
    super(1);
  }

  private long mN = start();
  private DynamicByteArray mBuf = null;

  protected int getSpecialDigit() {
    return 7;
  }

  protected long start() {
    return 0;
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
    final int d = getSpecialDigit();
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

