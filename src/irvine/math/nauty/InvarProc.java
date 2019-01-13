package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * @author Sean A. Irvine
 */
public interface InvarProc {

  /**
   * User supplied invariant procedure
   * @param graph the graph
   * @param lab labels
   * @param ptn partition
   * @param lev level
   * @param nc number of cells
   * @param tvpos position
   * @param inv invariant
   * @param h invariant argument
   * @param digraph if a digraph
   */
  void invariant(Graph graph, int[] lab, int[] ptn, int lev, int nc, int tvpos, int[] inv, int h, boolean digraph);
}
