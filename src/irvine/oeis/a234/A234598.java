package irvine.oeis.a234;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234598 Cardinality of the Weyl alternation set corresponding to the zero-weight in the adjoint representation of the Lie algebra of so(2n).
 * @author Sean A. Irvine
 */
public class A234598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234598() {
    super(4, new long[] {1, 3, 1, 1}, new long[] {9, 18, 35, 82});
  }
}
