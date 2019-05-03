package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198636 One half of total number of round trips, each of length <code>2n</code>, on the graph <code>P_6 (o-o-o-o-o-o)</code>.
 * @author Sean A. Irvine
 */
public class A198636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198636() {
    super(new long[] {1, -6, 5}, new long[] {3, 5, 13});
  }
}
