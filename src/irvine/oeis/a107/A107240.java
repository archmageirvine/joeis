package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107240.
 * @author Sean A. Irvine
 */
public class A107240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107240() {
    super(new long[] {1, -1, 1, -7, 3, 1, 3}, new long[] {1, 2, 3, 12, 37, 118, 407});
  }
}
