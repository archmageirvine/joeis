package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199572 Number of round trips of length n on the cycle graph C_2 from <code>any</code> of the two vertices.
 * @author Sean A. Irvine
 */
public class A199572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199572() {
    super(new long[] {4, 0}, new long[] {1, 0});
  }
}
