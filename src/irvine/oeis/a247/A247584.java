package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247584.
 * @author Sean A. Irvine
 */
public class A247584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247584() {
    super(new long[] {3, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1});
  }
}
