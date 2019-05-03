package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054419 Number of connected <code>3 X n</code> binary matrices (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A054419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054419() {
    super(new long[] {5, -3, 7}, new long[] {3, 21, 143});
  }
}
