package irvine.oeis.a036;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A036501 Number of inequivalent Golomb rulers with n marks and shortest length.
 * @author Sean A. Irvine
 */
public class A036501 extends Sequence2 {

  // Cf. A003022
  // This implementation is simple search and will not compute many terms in a reasonable time

  private int mN = 1;
  private int mMin = 0;
  private int mC = 0;

  private void search(final Set<Integer> knownDeltas, final int[] positions, final int markNumber, final int lastUsed) {
    if (markNumber == mN) {
      if (lastUsed <= mMin) {
        if (lastUsed < mMin) {
          mMin = lastUsed;
          mC = 1;
        } else {
          ++mC;
        }
      }
      return;
    }
    int k = lastUsed;
    while (++k <= mMin) {
      boolean ok = true;
      for (int j = 0; j < markNumber; ++j) {
        if (knownDeltas.contains(k - positions[j])) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (int j = 0; j < markNumber; ++j) {
          knownDeltas.add(k - positions[j]);
        }
        positions[markNumber] = k;
        search(knownDeltas, positions, markNumber + 1, k);
        for (int j = 0; j < markNumber; ++j) {
          knownDeltas.remove(k - positions[j]);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMin = Integer.MAX_VALUE;
    search(new HashSet<>(), new int[mN], 1, 0);
    return Z.valueOf(Math.max(1, mC / 2));
  }
}
