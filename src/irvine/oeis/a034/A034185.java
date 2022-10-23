package irvine.oeis.a034;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034185 Number of symmetric n X 3 crossword puzzle grids.
 * @author Sean A. Irvine
 */
public class A034185 extends Sequence1 {

  // Use 1 to denote a white square, 0 black
  // Pack entire column into an int (1-bit per square)
  // We build up the grid column-by-column, checking connectivity as we go.
  // Note there can initially be unconnected components, but they must all
  // be connected by the time the center column is reached.  In addition
  // checking is done to make show no cells or collection of cells is
  // orphaned as the filling in proceeds.

  private final int mEdgeMask = (1 << (height() - 1)) + 1;
  private int mN = 0;
  private long mCount = 0;
  private boolean[] mWorkspace = new boolean[height() + 1];

  protected int height() {
    return 3;
  }

  private int reverse(int p) {
    int rev = 0;
    for (int k = 0; k < height(); ++k) {
      rev <<= 1;
      rev |= p & 1;
      p >>>= 1;
    }
    return rev;
  }

  private boolean isConnected(final int[] connectivity) {
    for (final int v : connectivity) {
      if (v > 0 && v < Integer.MAX_VALUE) {
        return false;
      }
    }
    return true;
  }

  /**
   * Perform the actions for adding another column.
   * @param colsRemaining the number of columns remaining to reached the middle of the grid
   * @param prev binary representation of the previous column
   * @param connectivity component numbers for previous column (<code>Integer.MAX_VALUE</code> is black)
   * @param edgeConstraintSatisfied true iff all the edge requirements have been satisfied
   * (effectively means a cell has been detected on the top of the grid -- we get the bottom
   * for free by symmetry and there is one on the left (and hence right) by construction).
   */
  private void symmetricCount(final int colsRemaining, final int prev, final int[] connectivity, final boolean edgeConstraintSatisfied) {
    // Check if we finished to the middle
    if (colsRemaining <= 0) {
      if (!edgeConstraintSatisfied) {
        return; // never saw white at top or bottom
      }
      if (!isConnected(connectivity)) {
        return; // wasn't connected
      }
      if ((mN & 1) == 1 && reverse(prev) != prev) {
        //System.out.println("Rejected middle column not symmetric: " + Arrays.toString(connectivity));
        return; // middle column was not symmetric
      } else if ((reverse(prev) & prev) == 0) {
        return; // connectivity breaks between symmetric halves
      }
      //System.out.println("Accepted: " + colsRemaining + " " + Arrays.toString(connectivity) + " " + edgeConstraintSatisfied);
      ++mCount;
      return;
    }
    // Generate another column
    final int[] newConnectivity = new int[height()];

    // Determine maximum component number to this point
    int componentNumber = 0;
    for (final int v : connectivity) {
      if (v != Integer.MAX_VALUE && v > componentNumber) {
        componentNumber = v;
      }
    }

    // k loops over all possible of assignments of black and white for the column
    outer:
    for (int k = 1; k < 1L << height(); ++k) {
      int c = componentNumber;
      Arrays.fill(newConnectivity, Integer.MAX_VALUE);
      // Update connectivity information
      for (int j = 0; j < height(); ++j) {
        if ((k & (1 << j)) != 0) {
          // (x,j) is white
          if (j == 0) {
            newConnectivity[j] = Math.min(connectivity[j], ++c);
          } else {
            newConnectivity[j] = Math.min(Math.min(connectivity[j], newConnectivity[j - 1]), ++c);
          }
        }
      }
      // Minimize component numbers
      for (int j = height() - 1; j > 0; --j) {
        if ((k & (1 << (j - 1))) != 0) {
          newConnectivity[j - 1] = Math.min(newConnectivity[j - 1], newConnectivity[j]);
        }
      }
      // Check for orphans
      Arrays.fill(mWorkspace, false);
      for (int j = 0; j < height(); ++j) {
        if (connectivity[j] != Integer.MAX_VALUE && newConnectivity[j] <= connectivity[j]) {
          mWorkspace[connectivity[j]] = true;
        }
      }
      for (int j = 0; j < height(); ++j) {
        if (connectivity[j] != Integer.MAX_VALUE && !mWorkspace[connectivity[j]]) {
          continue outer; // connectivity fails
        }
      }
      // Continue with next column
      symmetricCount(colsRemaining - 1, k, newConnectivity, edgeConstraintSatisfied || ((k & mEdgeMask) != 0));
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final int[] connectivity = new int[height()];
    for (int k = 1; k < 1L << height(); ++k) { // no point in k==0 (all black column)
      Arrays.fill(connectivity, Integer.MAX_VALUE);
      int cluster = -1;
      for (int j = 0; j < height(); ++j) {
        if ((k & (1 << j)) != 0) {
          // (0,j) is white
          if (j == 0) {
            connectivity[j] = ++cluster;
          } else {
            connectivity[j] = Math.min(connectivity[j - 1], ++cluster);
          }
        }
      }
      symmetricCount((mN + 1) / 2 - 1, k, connectivity, (k & mEdgeMask) != 0);
    }
    return Z.valueOf(mCount);
  }
}

