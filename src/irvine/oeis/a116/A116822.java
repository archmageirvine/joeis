package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116822.
 * @author Sean A. Irvine
 */
public class A116822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116822() {
    super(new long[] {-1, 4, -18, 35, -51, 47, -26, 8}, new long[] {1, 2, 6, 21, 73, 241, 766, 2399});
  }
}
