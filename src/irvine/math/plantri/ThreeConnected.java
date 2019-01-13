package irvine.math.plantri;

/**
 * Test if a graph will remain 3-connected.
 * @author Gunnar Brinkmann
 * @author Brendan McKay
 * @author Sean A. Irvine
 */
final class ThreeConnected {

  private ThreeConnected() { }

  /*
   * Returns true if after performing a P1 expansion for edge e, the graph
   * will still be 3-connected, false else
   * Uses the fact that there are no 3-cycles.
   */
  static boolean willBe3Connected(final int[] degree, Edge e) {
    final int end1 = e.mPrev.mEnd;
    final int end2 = e.mNext.mEnd;

    if (degree[end1] < degree[end2]) {
      e = e.mPrev.mInverse;
      Edge run = e.mNext;
      final Edge last = e.mPrev;
      // end2 cannot be in the face left of run -- would be a double edge and for the same reason not in the face right of last
      while (run != last) {
        if (run.mInverse.mPrev.mEnd == end2) {
          return false;
        }
        run = run.mNext;
      }
    } else {
      e = e.mNext.mInverse;
      Edge run = e.mNext;
      final Edge last = e.mPrev;
      while (run != last) {
        if (run.mInverse.mPrev.mEnd == end1) {
          return false;
        }
        run = run.mNext;
      }
    }
    return true;
  }
}
