package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145654 Partial sums of A000918, starting from index 1.
 * @author Sean A. Irvine
 */
public class A145654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145654() {
    super(1, new long[] {2, -5, 4}, new long[] {0, 2, 8});
  }
}
