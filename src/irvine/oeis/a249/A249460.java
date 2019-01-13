package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249460.
 * @author Sean A. Irvine
 */
public class A249460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249460() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 1, 10, 55, 230});
  }
}
