package irvine.oeis.a000;

/**
 * A000513 Number of equivalence classes of <code>n X n</code> matrices over <code>{0,1}</code> with rows and columns summing to 4, where equivalence is defined by row and column permutations. Also number of isomorphism classes of bicolored quartic bipartite graphs, where isomorphism cannot exchange the colors.
 * @author Sean A. Irvine
 */
public class A000513 extends A000512 {

  @Override
  protected boolean checkColumns(final int[] m) {
    final int p = pop();
    for (int s = 0; s < m.length; ++s) {
      int c = 0;
      for (final int v : m) {
        c += (v >>> s) & 1;
      }
      if (c > p) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected int pop() {
    return 4;
  }

}
