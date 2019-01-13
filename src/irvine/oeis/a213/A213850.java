package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213850.
 * @author Sean A. Irvine
 */
public class A213850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213850() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 3, 10, 20, 42, 70, 120, 180});
  }
}
