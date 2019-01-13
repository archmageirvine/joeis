package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028495.
 * @author Sean A. Irvine
 */
public class A028495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028495() {
    super(new long[] {-1, 2, 1}, new long[] {1, 1, 2});
  }
}
