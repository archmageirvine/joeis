package irvine.math.nauty;

import irvine.math.graph.Graph;

/**
 * @author Sean A. Irvine
 */
public class DefaultDispatchVec implements DispatchVec {
  @Override
  public boolean isAutomorphism(final Graph g, final int[] perm, final boolean digraph) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int testCanLab(final Graph g1, final Graph g2, final int[] a1, final int[] a2) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void updateCan(final Graph g1, final Graph g2, final int[] a, final int b) {
    throw new UnsupportedOperationException();

  }

  @Override
  public void refine(final Graph g, final int[] lab, final int[] ptn, final int level, final int[] numCells, final int[] count, final NautySet active, final int[] code, final int m) {
    refine1(g, lab, ptn, level, numCells, count, active, code, m);
  }

  @Override
  public void refine1(final Graph g, final int[] a, final int[] b, final int c, final int[] d, final int[] e, final NautySet f, final int[] h, final int i) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean cheapAutom(final int[] a, final int n, final boolean b, final int c) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int targetCell(final Graph g, final int[] a, final int[] b, final int c, final int d, final boolean e, final int f) {
    throw new UnsupportedOperationException();
  }

}
