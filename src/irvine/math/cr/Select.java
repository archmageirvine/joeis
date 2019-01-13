package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of selected number.  Assumes <code>x=y</code> if <code>s=0</code>.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Select extends CR {

  private final CR mSelector;
  private final CR mOp1;
  private final CR mOp2;
  int mSelectorSign = 0;

  Select(final CR s, final CR x, final CR y) {
    mSelector = s;
    mOp1 = x;
    mOp2 = y;
  }

  @Override
  protected Z approximate(final int p) {
    if (mSelectorSign < 0) {
      return mOp1.getApprox(p);
    }
    if (mSelectorSign > 0) {
      return mOp2.getApprox(p);
    }
    final Z op1Appr = mOp1.getApprox(p - 1);
    final Z op2Appr = mOp2.getApprox(p - 1);
    final Z diff = op1Appr.subtract(op2Appr).abs();
    if (diff.compareTo(Z.ONE) <= 0) {
      // close enough; use either
      return scale(op1Appr, -1);
    }
    // op1 and op2 are different; selector != 0; safe to get sign of selector.
    if (mSelector.signum() < 0) {
      mSelectorSign = -1;
      return scale(op1Appr, -1);
    } else {
      mSelectorSign = 1;
      return scale(op2Appr, -1);
    }
  }
}

