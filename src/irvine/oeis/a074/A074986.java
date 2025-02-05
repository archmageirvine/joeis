package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074986 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private boolean contains(final int[] set, final int pos, final int value) {
    for (int i = 0; i < pos; ++i) {
      if (set[i] == value) {
        return true;
      }
    }
    return false;
  }

  private boolean isGcdOk(final int[] set, final int pos, final int k) {
    for (int j = 0; j < pos; ++j) {
      final int g = Functions.GCD.i(set[j], k);
      if (!contains(set, j + 1, g)) {
        return false;
      }
    }
    return true;
  }

  private boolean isLcmOk(final int[] set, final int pos, final int k) {
    for (int j = 0; j < pos; ++j) {
      final int l = Functions.LCM.i(set[j], k);
      if (l > mN) {
        return false;
      }
    }
    return true;
  }

  private boolean isLcmClosed(final int[] set, final int pos) {
    // We constructed so that set will be gcd closed, and we took care of some lcm,
    // but we need to check the full set is lcm closed
    for (int j = 0; j < pos; ++j) {
      for (int k = 0; k < j; ++k) {
        final int l = Functions.LCM.i(set[j], set[k]);
        if (!contains(set, pos, l)) {
          return false;
        }
      }
    }
    return true;
  }

  private void search(final int[] set, final int pos, final int prev) {
    if (pos > 0 && isLcmClosed(set, pos)) {
      ++mCount;
    }
    for (int k = prev + 1; k <= mN; ++k) {
      if (isGcdOk(set, pos, k) && isLcmOk(set, pos, k)) {
        set[pos] = k;
        search(set, pos + 1, k);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(new int[mN], 0, 0);
    return Z.valueOf(mCount);
  }
}
