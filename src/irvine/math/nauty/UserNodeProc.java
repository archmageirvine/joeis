package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * @author Sean A. Irvine
 */
public interface UserNodeProc {
  /**
   * User node procedure.
   * @param g graph
   * @param lab labels
   * @param ptn partition
   * @param level the level
   * @param nc number of cells
   * @param tc parameter
   * @param fix parameter
   */
  void userNodeProc(final Graph g, final int[] lab, final int[] ptn, final int level, final int nc, final int tc, final int fix);
}
