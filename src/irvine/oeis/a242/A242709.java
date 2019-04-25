package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242709 Nonequivalent ways to place two different markers (e.g., a pair of Go stones, black and white) on an n X n grid.
 * @author Sean A. Irvine
 */
public class A242709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242709() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 2, 12, 33, 85, 165, 315, 518});
  }
}
