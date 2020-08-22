package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213494 (A213493)/12.
 * @author Sean A. Irvine
 */
public class A213494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213494() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1, 4, 8, 17});
  }
}
