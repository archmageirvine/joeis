package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192904.
 * @author Sean A. Irvine
 */
public class A192904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192904() {
    super(new long[] {1, 1, 0, 3}, new long[] {1, 0, 1, 5});
  }
}
