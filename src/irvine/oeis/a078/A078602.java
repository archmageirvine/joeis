package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078602 Number of ways to lace a shoe that has n pairs of eyelets.
 * @author Sean A. Irvine
 */
public class A078602 extends Sequence1 {

  // In this implementation the top pair of eyelets is implicit.
  // We assume we start at one of these implicit eyelets and must finish at the other.
  // Thus, our n is one less than the description of the problem, and we number
  // our eyelets 0 to 2n-1 inclusive.
  // Rather than generate each full permutation in turn, rejecting those that
  // fail to meet lacing requirements, we recursively construct lacings checking
  // they remain valid at each step.
  // Cf. A072503

  private int mN = -1;
  private int mM;
  private long mCount = 0;

  private void search(final int p1, final int p2, final int numUsed, final int usedSet) {
    // sides is a 2-bit number indicating the two most recently used sides
    if (numUsed > mM) {
      // We have used every eyelet, check last three were not adjacent
      if (p2 != mM || p1 != mM - 1 || mN < 2) {
        ++mCount;
      }
      return;
    }
    for (int e = 0, bit = 1; e <= mM; ++e, bit <<= 1) {
      if ((usedSet & bit) == 0) {
        // Check we do not use three in a row
        if (p1 == p2 + 1 && p2 == e + 1 && (p1 < mN || e >= mN)) {
          continue;
        }
        if (p1 == p2 - 1 && p2 == e - 1 && (p1 >= mN || e < mN)) {
          continue;
        }
        search(p2, e, numUsed + 1, usedSet | bit);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mM = 2 * mN - 1; // precompute value useful in search
    mCount = 0;
    search(-1, -1, 0, 0);
    return Z.valueOf(mCount);
  }
}

