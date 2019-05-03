package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166963 Number of permutations in <code>S_{2n}</code> avoiding 123 and 1432 whose matrices are 180-degree symmetric.
 * @author Sean A. Irvine
 */
public class A166963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166963() {
    super(new long[] {-1, 1, 1, 0, 2}, new long[] {1, 2, 6, 12, 27});
  }
}
