package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249313.
 * @author Sean A. Irvine
 */
public class A249313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249313() {
    super(new long[] {-12, 0, 14, 0}, new long[] {1, 13, 14, 170});
  }
}
