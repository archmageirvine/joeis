package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122822.
 * @author Sean A. Irvine
 */
public class A122822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122822() {
    super(new long[] {-3, 1, 0, 2}, new long[] {0, 0, -1, 0});
  }
}
