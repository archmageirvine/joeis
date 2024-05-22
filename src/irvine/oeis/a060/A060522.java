package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060522 Number of 4 X n grids of black and white cells, no 3 of same color vertically or horizontally contiguous.
 * @author Sean A. Irvine
 */
public class A060522 extends Sequence1 {

  // Genuine computation not using the conjectured recurrence

  // Valid arrangements for a single column
  private static final int[] PERMITTED = {0b0010, 0b0011, 0b0100, 0b0101, 0b0110, 0b1001, 0b1010, 0b1011, 0b1100, 0b1101};

  private Z[] mCounts = null;

  @Override
  public Z next() {
    if (mCounts == null) {
      mCounts = new Z[256];
      return Z.valueOf(PERMITTED.length);
    } else if (mCounts[0] == null) {
      // Mark all valid arrangements for two columns
      Arrays.fill(mCounts, Z.ZERO);
      for (final int a : PERMITTED) {
        for (final int b : PERMITTED) {
          final int c = (a << 4) + b;
          mCounts[c] = Z.ONE;
        }
      }
    } else {
      // We need only previous two columns to determine counts for the next column
      final Z[] next = new Z[mCounts.length];
      Arrays.fill(next, Z.ZERO);
      for (final int a : PERMITTED) {
        for (final int b : PERMITTED) {
          final int c = (a << 4) + b;
          if (!mCounts[c].isZero()) {
            for (final int d : PERMITTED) {
              // Check horizontal compatability
              boolean ok = true;
              for (int bit = 0; bit < 4; ++bit) {
                final int h = ((d >> bit) & 1) + ((c >> bit) & 1) + ((c >> (4 + bit)) & 1);
                if (h == 0 || h == 3) {
                  ok = false;
                  break;
                }
              }
              if (ok) {
                final int v = (b << 4) + d;
                next[v] = next[v].add(mCounts[c]);
              }
            }
          }
        }
      }
      mCounts = next;
    }
    return Functions.SUM.z(mCounts);
  }
}
