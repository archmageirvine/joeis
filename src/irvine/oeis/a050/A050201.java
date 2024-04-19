package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A050201 Starting positions of strings of 2 0's in the decimal expansion of Pi.
 * Derived from A035117.
 * @author Georg Fischer
 */
public class A050201 extends A000796 {

  private final int mN = 0;
  private final long mM = -1;
  private final int mLast = 0;
  private final long mLastPos = 0;

  protected Z digit() {
    return Z.ONE;
  }

  protected int mOccur; 
  protected int mCount; 
  protected int mDigit;
  protected int mPos;
  protected int mState;

  /** Construct the sequence. */
  public A050201() {
    this(2, 0);
  }
  
  /**
   * Generic constructor with parameters
   * @param parm1 base
   * @param parm2 desired digits
   */
  public A050201(final int parm1, final int parm2) {
    mOccur = parm1;
    mDigit = parm2;
    mCount = 0;
    mPos = 0;
    mState = 1;
  }

  @Override
  public Z next() {
    int digit = -1;
    boolean busy = true;
    while (busy) {
      switch (mState) {
        case 2: // check whether there is a complete block with enough occurrences
          if (mCount >= mOccur) {
            mCount = mOccur - 1;
            busy = false;
          } else {
            digit = super.next().intValue();
            ++mPos;
            if (digit == mDigit) {
              ++mCount;
            } else {
              mState = 1;
            }
          }
          break;
        case 1: // get next digit
        default:
          digit = super.next().intValue();
          ++mPos;
          if (digit == mDigit) {
            mCount = 1;
            mState = 2;
          } // else read next and test again
          break;
      } // switch
    } // while
    return Z.valueOf(mPos - mOccur);
  }


/*
  @Override
  public Z next() {
    int digit = -1;
    int result = -1;
    boolean busy = true;
    while (busy) {
      switch (mState) {
        default:
        case 1: // get next digit
          digit = super.next().intValue();
          ++mPos;
          if (digit == mDigit) {
            mCount = 1;
            mState = 2;
            result = mPos;
          } // else read next and test again
          break;
        case 2: // check whether there is a first complete block with enough occurrences
          if (mCount >= mOccur) {
            mState = 3; // first block is complete
          } else {
            digit = super.next().intValue();
            ++mPos;
            if (digit == mDigit) {
              ++mCount;
            } else {
              mState = 1;
            }
          }
          break;
        case 3: // first block is complete, skip over successive blocks
          digit = super.next().intValue();
          ++mPos;
          if (digit == mDigit) {
            mCount = 1;
            mState = 4;
          } else {
            mState = 1;
            busy = false; // break loop
          }
          break;
        case 4: // check whether the next block has enough occurrences
          if (mCount >= mOccur) {
            mState = 3; // next block is complete
          } else { 
            digit = super.next().intValue();
            ++mPos;
            if (digit == mDigit) {
              ++mCount;
            } else {
              mState = 1;
              busy = false;
            }
          }
          break;
      } // switch
    } // while
    return Z.valueOf(result);
  }
*/
}
