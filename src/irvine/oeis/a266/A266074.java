package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266074.
 * @author Sean A. Irvine
 */
public class A266074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266074() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 6, 8, 16});
  }
}
