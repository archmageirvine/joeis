package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111666.
 * @author Sean A. Irvine
 */
public class A111666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111666() {
    super(new long[] {1, -3, 1, 0, -1, 3}, new long[] {2, 3, 4, 5, 10, 27});
  }
}
