package irvine.oeis.a393;

import irvine.oeis.ParallelPermutationSequence;

/**
 * A393394 allocated for Vincent Vatter.
 * @author Sean A. Irvine
 */
public class A393394 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A393394() {
    super(0);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos == 0) {
      return true;
    }
    if (p[pos - 1] == pos - 1) {
      return false; // fixed point
    }
    if (pos < 4) {
      return true;
    }
    final int x = p[pos - 1];
    for (int i = 0; i < pos - 1; ++i) {
      for (int j = i + 1; j < pos - 1; ++j) {
        // We will scan k > j
        int minAfterJ = Integer.MAX_VALUE;
        int maxAfterJ = Integer.MIN_VALUE;

        for (int k = j + 1; k < pos - 1; ++k) {
          final int pk = p[k];

          // For 2413: p[k] < p[i] < x < p[j]
          minAfterJ = Math.min(minAfterJ, pk);
          if (minAfterJ < p[i] && p[i] < x && x < p[j]) {
            return false;
          }

          // For 3142: p[j] < x < p[i] < p[k]
          maxAfterJ = Math.max(maxAfterJ, pk);
          if (p[j] < x && x < p[i] && p[i] < maxAfterJ) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
