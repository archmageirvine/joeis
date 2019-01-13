package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * @author Sean A. Irvine
 */
public interface DispatchVec {

  /**
   * Return true iff the permutation is an automorphism of the graph.
   * @param g graph
   * @param perm permutation
   * @param digraph digraph
   * @return true if this permutation is an automorphism
   */
  boolean isAutomorphism(Graph g, int[] perm, boolean digraph);

  /**
   * Compares <code>g^lab</code> to <code>canong</code>, using an ordering which
   * is immaterial since it's only used here.
   * The value returned is -1,0,1 if <code>g^lab &lt;,=,&gt; canong</code>.  <code>samerows[0]</code> is set to the number of
   * rows (0..n) of <code>canong</code> which are the same as those of g^lab.
   * @param g graph
   * @param canong canonical graph
   * @param lab labels
   * @param samerows output number of same rows
   * @return comparison of g to canonical
   */
  int testCanLab(Graph g, Graph canong, int[] lab, int[] samerows);

  /**
   * Update canonical partition
   * @param g graph
   * @param canong canonical graph
   * @param lab labels
   * @param samerows output number of same rows
   */
  void updateCan(Graph g, Graph canong, int[] lab, int samerows);

  /**
   * Refine partition.
   * @param g graph
   * @param a labels
   * @param b partition
   * @param c number of cells
   * @param d ???
   * @param e ???
   * @param f active elements
   * @param h ???
   * @param i ???
   */
  void refine(Graph g, int[] a, int[] b, int c, int[] d, int[] e, NautySet f, int[] h, int i);

  /**
   * Refine partition.
   * @param g graph
   * @param a labels
   * @param b partition
   * @param c number of cells
   * @param d ???
   * @param e ???
   * @param f active elements
   * @param h ???
   * @param i ???
   */
  void refine1(Graph g, int[] a, int[] b, int c, int[] d, int[] e, NautySet f, int[] h, int i);

  /**
   * Test for an easy automorphism.
   * @param ptn partition
   * @param level the level
   * @param digraph true for a directed graph
   * @param n size
   * @return true if cheap
   */
  boolean cheapAutom(final int[] ptn, final int level, final boolean digraph, final int n);

  /**
   * Decide which cell to split.
   * @param g graph
   * @param lab labels
   * @param ptn partition
   * @param level the level
   * @param tcLevel another level
   * @param digraph true for a directed graph
   * @param hint ???
   * @return target cell for splitting
   */
  int targetCell(final Graph g, final int[] lab, final int[] ptn, final int level, final int tcLevel, final boolean digraph, final int hint);

}
