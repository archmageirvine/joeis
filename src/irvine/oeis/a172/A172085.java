package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172085.
 * @author Sean A. Irvine
 */
public class A172085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172085() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 41, 212, 660});
  }
}
