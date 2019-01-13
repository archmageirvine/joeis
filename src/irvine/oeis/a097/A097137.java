package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097137.
 * @author Sean A. Irvine
 */
public class A097137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097137() {
    super(new long[] {3, -4, -2, 4}, new long[] {0, 0, 1, 4});
  }
}
