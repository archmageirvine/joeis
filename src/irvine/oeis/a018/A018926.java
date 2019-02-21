package irvine.oeis.a018;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018926.
 * @author Sean A. Irvine
 */
public class A018926 implements Sequence {

  // Uses the sub-cubes of n-cubes definition.  Brute force, does every arrangement
  // making no attempt to account for possible symmetries.

  private int mN = -1;
  private long mCount = 0;
  private int mLimit = 0;

  private int next(final int x, final int m) {
    assert m != 0;
    assert x <= m;
    if (x == m) {
      return m + 1;
    }
    int y = x;
    while ((++y & m) <= x) {
      // do nothing
    }
    return y;
  }

  private boolean isAvailable(final boolean[] used, final int least, final int dimensionMask) {
    if ((least & dimensionMask) != 0) {
      return false; // cannot go further in directions where already at edge of cube
    }
    for (int x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      final int pt = least + x;
      if (used[pt]) {
        return false;
      }
    }
    return true;
  }

  private void add(final boolean[] used, final int least, final int dimensionMask) {
    // All the points we need are guaranteed to not be already present in "used"
    for (int x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      used[least + x] = true;
    }
  }

  private void remove(final boolean[] used, final int least, final int dimensionMask) {
    for (int x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      used[least + x] = false;
    }
  }

  private int mex(final boolean[] set) {
    for (int k = 0; k < set.length; ++k) {
      if (!set[k]) {
        return k;
      }
    }
    return set.length;
  }

  /*
   * Represent the corners of n-cube by n-bit binary number.
   * Find least unused number (i.e. start with 0).  If there is no such number
   * then we have succeeded in generating sub-cubes, increase the count.
   * Otherwise, for each possible number of dimensions d in {0..mN}, and for
   * each possible selection of d directions, extract a sub-cube, then
   * recursively continue the search.
   */
  private void search(final boolean[] used) {
    final int least = mex(used);
    //System.out.println(used + " least=" + least);
    if (least >= mLimit) {
      // partitioning is complete
      ++mCount;
      return;
    }
    for (int numDim = mN - Long.bitCount(least); numDim > 0; --numDim) {
      for (int selectedDimensions = (1 << numDim) - 1; selectedDimensions < mLimit; selectedDimensions = IntegerUtils.swizzle(selectedDimensions)) {
        if (isAvailable(used, least, selectedDimensions)) {
          add(used, least, selectedDimensions);
          search(used);
          remove(used, least, selectedDimensions);
        }
      }
    }
    // Do dimension 0 case (i.e. treating "least" as a point)
    used[least] = true;
    search(used);
    used[least] = false;
  }

  @Override
  public Z next() {
    mLimit = 1 << ++mN;
    mCount = 0;
    search(new boolean[mLimit]);
    return Z.valueOf(mCount);
  }
}

