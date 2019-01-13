package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048773.
 * @author Sean A. Irvine
 */
public class A048773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048773() {
    super(new long[] {-1, -1, 3}, new long[] {1, 11, 32});
  }
}
