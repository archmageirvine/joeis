package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249311.
 * @author Sean A. Irvine
 */
public class A249311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249311() {
    super(new long[] {-8, 0, 10, 0}, new long[] {1, 9, 10, 82});
  }
}
