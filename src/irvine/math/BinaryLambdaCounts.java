package irvine.math;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;

/**
 * Counts binary lambda terms by size and the number of enclosing binders.
 * @author Gregory Morse
 */
public final class BinaryLambdaCounts {

  private final boolean mNormal;
  private final List<Z[]> mTerms = new ArrayList<>();
  private final List<Z[]> mNeutral = new ArrayList<>();

  /**
   * Choose between all terms and beta-normal forms.
   * @param normal count only normal forms
   */
  public BinaryLambdaCounts(final boolean normal) {
    mNormal = normal;
  }

  private static Z get(final List<Z[]> rows, final int size, final int binders) {
    final Z[] row = rows.get(size);
    // A variable in a term of this size cannot use any further binder.
    return row[Math.min(binders, row.length - 1)];
  }

  private void append() {
    final int size = mTerms.size();
    final Z[] row = new Z[Math.max(1, size)];
    final Z[] neutral = mNormal ? new Z[row.length] : null;
    for (int k = 0; k < row.length; ++k) {
      if (size < 2) {
        row[k] = Z.ZERO;
        if (mNormal) {
          neutral[k] = Z.ZERO;
        }
      } else {
        Z sum = k >= size - 1 ? Z.ONE : Z.ZERO;
        // An application is normal only if its function is neutral
        // (a variable with zero or more arguments) and its argument is normal.
        final List<Z[]> functions = mNormal ? mNeutral : mTerms;
        for (int i = 2; i <= size - 4; ++i) {
          sum = sum.add(get(functions, i, k).multiply(get(mTerms, size - 2 - i, k)));
        }
        if (mNormal) {
          neutral[k] = sum;
        }
        row[k] = sum.add(get(mTerms, size - 2, k + 1));
      }
    }
    mTerms.add(row);
    if (mNormal) {
      mNeutral.add(neutral);
    }
  }

  /**
   * Count terms with this encoded size and no free indices beyond the binders given.
   * @param size encoded bit length
   * @param binders number of enclosing binders
   * @return number of terms
   */
  public Z count(final int size, final int binders) {
    if (size < 0 || binders < 0) {
      throw new IllegalArgumentException();
    }
    while (mTerms.size() <= size) {
      append();
    }
    return get(mTerms, size, binders);
  }
}
