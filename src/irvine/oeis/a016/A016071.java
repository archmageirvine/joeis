package irvine.oeis.a016;

import java.util.NavigableSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016071 Successive pattern lengths of a conjectured Busy Beaver by Uwe Schult.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A016071 extends Sequence0 {

  // Schult's machine, in the order A0, A1, ..., E0, E1 (Michel's survey, section 4.4).
  private static final String[] RULES = {"1RB", "0LC", "1RC", "1RD", "1LA", "0RB", "0RE", "1RH", "1LC", "1RA"};

  private final NavigableSet<Integer> mMarks = new TreeSet<>();
  private int mHead;
  private int mState;
  private boolean mStarted;
  private boolean mHalted;

  private boolean atPattern() {
    if (mState != 0 || mMarks.isEmpty()) {
      return false;
    }
    final int first = mMarks.first();
    final int last = mMarks.last();
    if (mHead != first + 4 || last < mHead || !mMarks.contains(first + 1)) {
      return false;
    }
    // At this phase the nonblank span is 11(01)^k, possibly with
    // an additional terminal 1. The head is at the fifth cell.
    for (int k = first + 2; k < last; ++k) {
      if (mMarks.contains(k) != (((k - first) & 1) == 1)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (!mStarted) {
      mStarted = true;
      return Z.valueOf(mMarks.size());
    }
    while (!mHalted) {
      final String rule = RULES[2 * mState + (mMarks.contains(mHead) ? 1 : 0)];
      if (rule.charAt(0) == '1') {
        mMarks.add(mHead);
      } else {
        mMarks.remove(mHead);
      }
      if (rule.charAt(2) == 'H') {
        mHalted = true;
      } else {
        mHead += rule.charAt(1) == 'R' ? 1 : -1;
        mState = rule.charAt(2) - 'A';
        if (atPattern()) {
          return Z.valueOf(mMarks.last() - mMarks.first() + 1);
        }
      }
    }
    return null;
  }
}

