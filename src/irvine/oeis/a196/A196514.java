package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196514 Partial sums of A100381.
 * @author Sean A. Irvine
 */
public class A196514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196514() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 4, 28, 124});
  }
}
