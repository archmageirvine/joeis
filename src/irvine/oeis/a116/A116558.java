package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116558.
 * @author Sean A. Irvine
 */
public class A116558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116558() {
    super(new long[] {-1, 0, 0, 0, 6, 0, 0, 0}, new long[] {0, 1, 1, 5, 2, 5, 5, 29});
  }
}
