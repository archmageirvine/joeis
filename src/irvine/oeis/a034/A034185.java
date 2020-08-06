package irvine.oeis.a034;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034185.
 * @author Sean A. Irvine
 */
public class A034185 implements Sequence {

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

  private void symmetricCount(final int colsRemaining, final int prev, final int[] connectivity, final boolean edgeConstraintSatisfied) {
    //System.out.println(colsRemaining + " " + Arrays.toString(connectivity) + " " + edgeConstraintSatisfied);
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
      //System.out.println(colsRemaining + " k=" + k + " newcon=" + Arrays.toString(newConnectivity));
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

