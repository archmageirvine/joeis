package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A072503 Number of ways to lace a shoe with n eyelet pairs such that there is no direct "horizontal" connection between any adjacent eyelet pair.
 * @author Sean A. Irvine
 */
public class A072503 extends Sequence3 {

  // In this implementation the top pair of eyelets is implicit.
  // We assume we start at one of these implicit eyelets and must finish at the other.
  // Thus, our n is one less than the description of the problem, and we number
  // our eyelets 0 to 2n-1 inclusive.
  // Rather than generate each full permutation in turn, rejecting those that
  // fail to meet lacing requirements, we recursively construct lacings checking
  // they remain valid at each step.

  private int mN = 1;
  private int mM;
  private long mCount = 0;

  private void search(final int currentEyelet, final int numUsed, final int usedSet, final int sides) {
    // sides is a 2-bit number indicating the two most recently used sides
    if (numUsed > mM) {
      // We have used every eyelet, remains to check we can exit
      if (sides != 3) {
        ++mCount;
      }
      return;
    }
    for (int e = 0, bit = 1; e <= mM; ++e, bit <<= 1) {
      if ((usedSet & bit) == 0 && e != mM - currentEyelet) {
        if (e < mN) {
          if (sides != 0) {
            // Valid to use the left side
            search(e, numUsed + 1, usedSet | bit, (sides << 1) & 3);
          }
        } else {
          if (sides != 3) {
            // Valid to use the right side
            search(e, numUsed + 1, usedSet | bit, ((sides << 1) & 3) | 1);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mM = 2 * mN - 1; // precompute value useful in search
    mCount = 0;
    search(-1, 0, 0, 0b10); // start with "10" as sides used
    // Divide by 2 to account for mirror symmetry
    // Note absence of horizontal lines makes this valid
    return Z.valueOf(mCount / 2);
  }
}

