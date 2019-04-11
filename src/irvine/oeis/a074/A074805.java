package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074805 <code>n mod 19 + 1</code> ("Golden Number").
 * @author Sean A. Irvine
 */
public class A074805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074805() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19});
  }
}
