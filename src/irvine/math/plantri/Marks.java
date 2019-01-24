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

  /**
   * Construct marks of specified size.
   * @param size number of marks
   */
  public Marks(final int size) {
    mMarks = new int[size];
  }

  /**
   * Reset all marks.
   */
  public void resetMarksVertex() {
    if ((++mMarkValueVertex) > 30000) {
      mMarkValueVertex = 1;
      Arrays.fill(mMarks, 0);
    }
  }

  void unmarkVertex(final int x) {
    mMarks[x] = 0;
  }

  /**
   * Check if a vertex is marked.
   * @param x vertex
   * @return true iff marked
   */
  public boolean isMarkedVertex(final int x) {
    return mMarks[x] == mMarkValueVertex;
  }

  /**
   * Mark a vertex.
   * @param x place to mark
   */
  public void markVertex(final int x) {
    mMarks[x] = mMarkValueVertex;
  }

}
