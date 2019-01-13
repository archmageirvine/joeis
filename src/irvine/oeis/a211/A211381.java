package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211381.
 * @author Sean A. Irvine
 */
public class A211381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211381() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 0, 0, 7, 24, 63});
  }
}
