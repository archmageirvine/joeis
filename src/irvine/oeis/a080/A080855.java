package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080855.
 * @author Sean A. Irvine
 */
public class A080855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080855() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 16});
  }
}
