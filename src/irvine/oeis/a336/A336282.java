package irvine.oeis.a336;

import irvine.oeis.ParallelPermutationSequence;

/**
 * A336282 Number of heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A336282 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A336282(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A336282() {
    this(0);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p.length < 1) {
      return true;
    }
    // Test if (partial) permutation is heapable
    final int[] sig = new int[p.length + 1];
    sig[1] = 2;
    for (int k = 1; k < pos; ++k) {
      int j = p[k] + 1;
      sig[j] = 2;
      while (j > 0) {
        --j;
        if (sig[j] > 0) {
          --sig[j];
          break;
        }
      }
      if (j <= 0) {
        return false;
      }
    }
    return true;
  }
}
