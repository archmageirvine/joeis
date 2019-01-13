package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048626.
 * @author Sean A. Irvine
 */
public class A048626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048626() {
    super(new long[] {1, 0, 1}, new long[] {6, 9, 13});
  }
}
