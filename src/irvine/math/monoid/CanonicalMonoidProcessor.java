package irvine.math.monoid;

import irvine.util.Permutation;

/**
 * Restrict to canonical monoids.
 * @author Sean A. Irvine
 */
public class CanonicalMonoidProcessor implements MonoidProcessor {

  private final MonoidProcessor mInnerProcessor;

  /**
   * Wrap another monoid processor with the canonical processor.
   * @param processor underlying processor
   */
  public CanonicalMonoidProcessor(final MonoidProcessor processor) {
    mInnerProcessor = processor;
  }

  private boolean lt(final int[][] a, final int[][] b) {
    final int n = a.length;
    for (int k = 0; k < n; ++k) {
      for (int j = 0; j < n; ++j) {
        if (a[k][j] < b[k][j]) {
          return true;
        }
        if (a[k][j] > b[k][j]) {
          return false;
        }
      }
    }
    return false;
  }

  @Override
  public void process(final int[][] monoid) {
    final int n = monoid.length;
    final Permutation perm = new Permutation(n);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] == 0) {
        final int[][] t = new int[n][n];
        for (int k = 0; k < n; ++k) {
          for (int j = 0; j < n; ++j) {
            final int e = p[monoid[p[k]][p[j]]];
            t[k][j] = e;
          }
        }
        if (lt(t, monoid)) {
          return;
        }
      }
    }
    mInnerProcessor.process(monoid);
  }
}
