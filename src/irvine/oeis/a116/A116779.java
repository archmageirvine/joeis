package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116779.
 * @author Sean A. Irvine
 */
public class A116779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116779() {
    super(new long[] {1, -5, 11, -12, 6}, new long[] {1, 2, 6, 21, 72});
  }
}
