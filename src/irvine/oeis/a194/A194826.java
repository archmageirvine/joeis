package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194826 Units' digits of the nonzero 9-gonal (nonagonal) numbers.
 * @author Sean A. Irvine
 */
public class A194826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194826() {
    super(new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 9, 4, 6, 5, 1, 4, 4, 1, 5, 6, 4, 9, 1, 0});
  }
}
