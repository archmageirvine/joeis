package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116702.
 * @author Sean A. Irvine
 */
public class A116702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116702() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 5, 13});
  }
}
