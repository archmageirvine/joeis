package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267515.
 * @author Sean A. Irvine
 */
public class A267515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267515() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 5, 10, 21, 42, 84, 169});
  }
}
