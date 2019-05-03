package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;
import java.util.Set;

/**
 * A003022 Length of shortest (or optimal) Golomb ruler with n marks.
 * @author Sean A. Irvine
 */
public class A003022 implements Sequence {

  // This implementation is simple search and will not compute many terms in a reasonable time

  private int mN = 1;
  private int mMin = 0;

  private void search(final Set<Integer> knownDeltas, final int[] positions, final int markNumber, final int lastUsed) {
    if (markNumber == mN) {
      if (lastUsed < mMin) {
        mMin = lastUsed;
      }
      return;
    }
    int k = lastUsed;
    while (++k < mMin) {
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
    return Z.valueOf(mMin);
  }
}
