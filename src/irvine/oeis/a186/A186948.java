package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186948.
 * @author Sean A. Irvine
 */
public class A186948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186948() {
    super(new long[] {3, -7, 5}, new long[] {1, 1, 5});
  }
}
