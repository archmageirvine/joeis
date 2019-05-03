package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143008 Crystal ball sequence for the <code>A2 x A2</code> lattice.
 * @author Sean A. Irvine
 */
public class A143008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143008() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 13, 73, 253, 661});
  }
}
