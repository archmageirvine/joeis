package irvine.oeis.a103;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A103693 Add 1 to each of the preceding digits, beginning with 0.
 * @author Georg Fischer
 */
public class A103693 extends AbstractSequence {

  private int mAdd;
  private int mIx; // current index where to add
  private int mState; // 0 for 10^0 digit, 1 for 10^1 digit, 2 if >= 20
  private int mNext; // next value
  private ArrayList<Integer> mA = new ArrayList<>();
  // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 1, 3, 2, 4

  /** Construct the sequence. */
  public A103693() {
    this(0, 1, 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param add add this amount to each digit
   * @param start starting index
   */
  public A103693(final int offset, final int add, final int start) {
    super(offset);
    mAdd = add;
    mIx = -1;
    mA.add(start);
    mNext = mA.get(0);
    mState = 0;
  }

  @Override
  public Z next() {
    int result = mNext;
    if (--mState < 0) {
      mState = 1;
      ++mIx;
    }
    mNext = mA.get(mIx);
    if (mState == 1) {
      if (mNext >= 10) {
        mNext = mNext / 10 + mAdd;
      } else {
        mNext = mNext % 10 + mAdd;
        mState = 0;
      }
    } else {
      mNext = mNext % 10 + mAdd;
    }
    mA.add(mNext);
    return Z.valueOf(result);
  }
}
