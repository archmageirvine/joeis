package irvine.oeis.a000;

/**
 * A000516 Number of equivalence classes of n X n matrices over {0,1} with rows and columns summing to 5, where equivalence is defined by row and column permutations. Isomorphism classes of bicolored 5-regular bipartite graphs, where isomorphism cannot exchange the colors.
 * @author Sean A. Irvine
 */
public class A000516 extends A000512 {

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
    /*

    final int[] c = new int[m.length];
    for (int v : m) {
      for (int j = 0; j < c.length; ++j) {
        if ((v & 1) != 0 && ++c[j] > p) {
          return false;
        }
        v >>>= 1;
      }
    }
    return true;
    */
  }

  @Override
  protected int pop() {
    return 5;
  }

}
