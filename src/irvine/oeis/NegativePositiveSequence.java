package irvine.oeis;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Generate OEIS Sequence A131393 and its companions
 * as defined by Clark Kimberling.
 * @author Georg Fischer
 */
public class NegativePositiveSequence implements SequenceWithOffset {
  protected int mRule;
  protected int mSub;
  protected int mVariant;
  protected int mK;
  protected int mAk;
  protected int mDk;
  protected int mAk1;
  protected int mDk1;
  protected int mA1;
  protected int mD1;
  protected HashMap<Integer, Integer> mAMap;
  protected HashMap<Integer, Integer> mDMap;
  private int mOffset;

  /**
   * No-args constructor.
   */
  public NegativePositiveSequence() {
    this(1, 1, "ak", 1, 0);
  } // no-args constructor

  /**
   * Constructor with parameters.
   * @param rule major rule number according to Clark Kimberling
   * @param sub minor rule number
   * @param op operation: ak or dk
   * @param a1 start value of ak
   * @param d1 start value pf dk
   */
  public NegativePositiveSequence(final int rule, final int sub, final String op, final int a1, final int d1) {
    mOffset = 1;
    mRule = rule;
    mSub = sub;
    mA1 = a1;
    mD1 = d1;
    mAMap = new HashMap<>(2048);
    mDMap = new HashMap<>(2048);
    if ("ak".equals(op)) {
      mVariant = 1;
    } else if ("dk".equals(op)) {
      mVariant = 2;
    } else {
      mVariant = 0;
      throw new UnsupportedOperationException("variant \"" + op + "\" not implemented");
    }
    mK = 1;
    mAk = mA1;
    mAk1 = mAk;
    mDk = mD1;
    mDk1 = mDk;
    mAMap.put(mAk, mK);
    mDMap.put(mDk, mK); // dk is h
  } // no-args constructor

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    // implemented variants are ak, dk only
    final Z result;
    switch (mVariant) {
      case 1: // ak
        result = Z.valueOf(mAk);
        break;
      case 2: // dk
        result = Z.valueOf(mDk);
        break;
      default:
        throw new RuntimeException();
    } // switch mVariant

    ++mK;
    boolean busy = true;
    if (mRule == 1 || mRule == 2) { // for A131388, A257705 et al.
      mDk = -1; // start downwards
      if (mRule == 2 && mDk1 < 0) { // for A131393 et al.
        mDk = mDk1 - 1;
      }
      while (busy && mDk > mSub - mAk1) { // downwards
        mAk = mAk1 + mDk;
        if (mAk > 0 && mAMap.get(mAk) == null && mDMap.get(mDk) == null) {
          busy = false;
          mAMap.put(mAk, mK);
          mDMap.put(mDk, mK);
        } else {
          --mDk;
        }
      } // while downwards
      if (busy) {
        mDk = 1; // start upwards
      }
      while (busy) { // upwards
        mAk = mAk1 + mDk;
        if (mAMap.get(mAk) == null && mDMap.get(mDk) == null) {
          busy = false;
          mAMap.put(mAk, mK);
          mDMap.put(mDk, mK);
        } else {
          ++mDk;
        }
      } // while upwards
    } else if (mRule == 3) { // for A257905, 908
      mDk = mSub - mAk1 + 1; // start upwards in negative
      while (busy && mDk < 0) {
        mAk = mAk1 + mDk;
        if (mAk > 0 && mAMap.get(mAk) == null && mDMap.get(mDk) == null) {
          busy = false;
          mAMap.put(mAk, mK);
          mDMap.put(mDk, mK);
        } else {
          ++mDk;
        }
      } // while negative
      if (busy) {
        mDk = 1; // start upwards
      }
      while (busy) { // upwards
        mAk = mAk1 + mDk;
        if (mAMap.get(mAk1 - mDk) == null && mDMap.get(mDk) == null) {
          busy = false;
          mAMap.put(mAk, mK);
          mDMap.put(mDk, mK);
        } else {
          ++mDk;
        }
      } // while upwards
    } else if (mRule == 4) { // "Algorithm" for A257883 et al.
      mDk = mSub - mAk + 1;
      while (busy) { // upwards
        mAk = mAk1 + mDk;
        if (mAk > 0 && mAMap.get(mAk) == null && mDMap.get(mDk) == null) {
          busy = false;
          mAMap.put(mAk, mK);
          mDMap.put(mDk, mK);
        } else {
          ++mDk;
        }
      } // while upwards
    }
    mAk1 = mAk;
    mDk1 = mDk;
    ++mK; // iterate
    return result;
  } // next
}
