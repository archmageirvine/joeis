package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116759.
 * @author Sean A. Irvine
 */
public class A116759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116759() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 71, 209, 533});
  }
}
