package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122605.
 * @author Sean A. Irvine
 */
public class A122605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122605() {
    super(new long[] {-1, 4, 6, -10, -5, 6, 1}, new long[] {1, 0, 0, 0, 0, 0, 0});
  }
}
