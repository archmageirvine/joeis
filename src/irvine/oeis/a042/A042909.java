package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042909.
 * @author Sean A. Irvine
 */
public class A042909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042909() {
    super(new long[] {1, 0, 0, 314, 0, 0}, new long[] {1, 2, 5, 312, 629, 1570});
  }
}
