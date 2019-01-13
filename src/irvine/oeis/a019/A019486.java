package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019486.
 * @author Sean A. Irvine
 */
public class A019486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019486() {
    super(new long[] {-1, -1, -1, -1, 0, 1, 2}, new long[] {2, 5, 12, 28, 65, 150, 346});
  }
}
