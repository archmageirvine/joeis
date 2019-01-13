package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117353.
 * @author Sean A. Irvine
 */
public class A117353 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117353() {
    super(new long[] {4, -4, -1, 3}, new long[] {1, 2, 5, 9});
  }
}
