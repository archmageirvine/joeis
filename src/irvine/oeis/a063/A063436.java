package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063436 Write 1, 2, 3, 4, ... counterclockwise in a hexagonal spiral around 0 starting left down, then a(n) is the sequence found by reading from 0 in the vertical upward direction.
 * @author Sean A. Irvine
 */
public class A063436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063436() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 54});
  }
}
