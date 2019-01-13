package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162262.
 * @author Sean A. Irvine
 */
public class A162262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162262() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-3, 5, 30, 78});
  }
}
