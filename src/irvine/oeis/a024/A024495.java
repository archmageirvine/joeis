package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024495.
 * @author Sean A. Irvine
 */
public class A024495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024495() {
    super(new long[] {2, -3, 3}, new long[] {0, 0, 1});
  }
}
