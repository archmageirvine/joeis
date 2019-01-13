package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048771.
 * @author Sean A. Irvine
 */
public class A048771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048771() {
    super(new long[] {-1, -1, 3}, new long[] {1, 9, 26});
  }
}
