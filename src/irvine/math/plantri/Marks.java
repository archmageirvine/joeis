package irvine.math.plantri;

import java.util.Arrays;

/**
 * Used for tracking vertex marks.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
public class Marks {

  private final int[] mMarks;
  private int mMarkValueVertex = 30000;

  Marks(final int size) {
    mMarks = new int[size];
  }

  void resetMarksVertex() {
    if ((++mMarkValueVertex) > 30000) {
      mMarkValueVertex = 1;
      Arrays.fill(mMarks, 0);
    }
  }

  void unmarkVertex(final int x) {
    mMarks[x] = 0;
  }

  boolean isMarkedVertex(final int x) {
    return mMarks[x] == mMarkValueVertex;
  }

  void markVertex(final int x) {
    mMarks[x] = mMarkValueVertex;
  }

}
