package irvine.oeis.a018;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006016;

/**
 * A018926.
 * @author Sean A. Irvine
 */
public class A018926 implements Sequence {

  // todo differs at a(3), am I counting the right thing?
  // todo using long for dimensions a bit optimisitic -- unlikely we can get to the 33-cube with this approach!

  // Uses the sub-cubes of n-cubes definition

  private int mN = -1;
  private long mCount = 0;

  private long next(final long x, final long m) {
    long y = x;
    while ((++y & m) == x) {
      // do nothing
    }
    return y;
  }

  private boolean isAvailable(final TreeSet<Long> used, final long least, final long dimensionMask) {
    if ((least & dimensionMask) != 0) {
      return false; // cannot go further in directions where already at edge of cube
    }
    for (long x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      final long pt = least + x;
      if (used.contains(pt)) {
        return false;
      }
    }
    return true;
  }

  private void add(final TreeSet<Long> used, final long least, final long dimensionMask) {
    // All the points we need are guaranteed to not be already present in "used"
    for (long x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      used.add(least + x);
    }
  }

  private void remove(final TreeSet<Long> used, final long least, final long dimensionMask) {
    for (long x = 0; x <= dimensionMask; x = next(x, dimensionMask)) {
      used.remove(least + x);
    }
  }

  /*
   * Represent the corners of n-cube by n-bit binary number.
   * Find least unused number (i.e. start with 0).  If there is no such number
   * then we have succeeded in generating sub-cubes, increase the count.
   * Otherwise, for each possible number of dimensions d in {0..mN}, and for
   * each possible selection of d directions, extract a sub-cube, then
   * recursively continue the search.
   */
  private void search(final TreeSet<Long> used) {
    final long least = A006016.mex(used);
    //System.out.println(used + " least=" + least);
    if (least >= 1L << mN) {
      // partitioning is complete
      ++mCount;
//      if (least != used.size()) {
//        throw new RuntimeException(); // Huh?
//      }
      return;
    }
    for (int numDim = mN - Long.bitCount(least); numDim >= 0; --numDim) {
      if (numDim == 0) {
        // Handle special case of single point
        used.add(least);
        search(used);
        used.remove(least);
      } else {
        for (long selectedDimensions = (1L << numDim) - 1; selectedDimensions < 1L << mN; selectedDimensions = LongUtils.swizzle(selectedDimensions)) {
          if (isAvailable(used, least, selectedDimensions)) {
            add(used, least, selectedDimensions);
            search(used);
            remove(used, least, selectedDimensions);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(new TreeSet<>());
    return Z.valueOf(mCount);
  }
}

