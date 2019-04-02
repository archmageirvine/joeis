package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122879 Periodic sequence of period 21.
 * @author Sean A. Irvine
 */
public class A122879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122879() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 0, 0, 0, 1});
  }
}
