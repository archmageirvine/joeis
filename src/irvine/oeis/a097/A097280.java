package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097280.
 * @author Sean A. Irvine
 */
public class A097280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097280() {
    super(new long[] {-1, 0, 2}, new long[] {5, 7, 9});
  }
}
