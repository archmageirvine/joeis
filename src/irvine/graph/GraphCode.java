package irvine.graph;

import java.util.Arrays;

/**
 * Holder for a graph code.
 *
 * @author Sean A. Irvine
 */
class GraphCode {

  final int[] mMap;
  final int[][] mLabel;

  GraphCode(final int order) {
    mMap = new int[order + 1];
    mLabel = new int[order + 1][order + 1];
  }

  boolean same(final GraphCode other) {
    for (int k = 0; k < mLabel.length; ++k) {
      if (!Arrays.equals(mLabel[k], other.mLabel[k])) {
        return false;
      }
    }
    return true;
  }
}
