package irvine.oeis.a377;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A377573.
 * @author Sean A. Irvine
 */
public class A377573 extends Sequence0 {

  // After method described by Allan Wechsler on SeqFan mailing list, 2024-11-02

  private static final int[][] TRANSITIONS = {
    {1, 7},  // 0
    {2, 8},  // 1
    {3, 9},  // 2
    {4, 10}, // 3
    {5, 11}, // 4
    {6, 12}, // 5
    {0, 13}, // 6
    {0, 13}, // 7
    {1, 7},  // 8
    {2, 8},  // 9
    {3, 9},  // 10
    {4, 10}, // 11
    {5, 11}, // 12
    {6, 12}, // 13
  };

  private Z[] mCounts = null;

  @Override
  public Z next() {
    if (mCounts == null) {
      mCounts = new Z[TRANSITIONS.length];
      Arrays.fill(mCounts, Z.ZERO);
      mCounts[0] = Z.ONE;
    } else {
      final Z[] c = new Z[mCounts.length];
      for (int k = 0; k < c.length; ++k) {
        Z s = Z.ZERO;
        for (final int t : TRANSITIONS[k]) {
          s = s.add(mCounts[t]);
        }
        c[k] = s;
      }
      mCounts = c;
    }
    return mCounts[0];
  }
}

