package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A082827 Triangle read by rows in which the n-th row contains n numbers not included earlier whose concatenation forms a palindrome.
 * @author Sean A. Irvine
 */
public class A082827 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mLeastUnused = Z.THREE;
  protected Z[] mRow = {};
  private int mM = 0;

  protected void step() {
    mRow = new Z[mRow.length + 1];
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    if (mRow.length == 1) {
      mRow[0] = Z.ONE;
    } else if (mRow.length == 2) {
      // Likely only case where final number cannot be simple reversal of some prefix
      mRow[0] = Z.TWO;
      mRow[1] = Z.valueOf(12);
      mUsed.add(mRow[1]);
    } else {
      final StringBuilder sb = new StringBuilder();
      Z t = mLeastUnused;
      for (int k = 0; k < mRow.length - 1; ++k) {
        mRow[k] = t;
        mUsed.add(t);
        sb.append(t);
        do {
          t = t.add(1);
        } while (mUsed.contains(t));
      }
      for (int k = 1; k <= sb.length(); ++k) {
        final StringBuilder rev = new StringBuilder(sb.substring(0, k)).reverse();
        if (rev.charAt(0) != '0') {
          final String s = sb.toString() + rev;
          if (StringUtils.isPalindrome(s)) {
            final Z r = new Z(rev);
            if (mUsed.add(r)) {
              mRow[mRow.length - 1] = r;
              break;
            }
          }
        }
      }
      if (mRow[mRow.length - 1] == null) {
        throw new UnsupportedOperationException("Row requires a special case");
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      step();
    }
    return mRow[mM];
  }
}
