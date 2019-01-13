package irvine.math.plantri;

/**
 * Provides per thread creation of edges.
 * @author Sean A. Irvine
 */
public class EdgeFactory {

  private int mAlloc = -1; // Global tracking of edges as they are created
  private int mMarkValue = 30000;

  Edge createEdge() {
    return new Edge(++mAlloc);
  }

  void mark(final Edge e) {
    e.mMark = mMarkValue;
  }

  void markLo(final Edge e) {
    e.mMark = mMarkValue;
  }

  void markHi(final Edge e) {
    e.mMark = mMarkValue + 1;
  }

  void unmark(final Edge e) {
    e.mMark = mMarkValue - 1;
  }

  boolean isMarked(final Edge e) {
    return e.mMark >= mMarkValue;
  }

  boolean isMarkedLo(final Edge e) {
    return e.mMark == mMarkValue;
  }

  boolean isMarkedHi(final Edge e) {
    return e.mMark > mMarkValue;
  }

  void resetMarks(final Edge[] edges) {
    if ((mMarkValue += 2) > 30000) {
      mMarkValue = 2;
      for (final Edge edge : edges) {
        edge.mMark = 0;
      }
    }
  }

}
