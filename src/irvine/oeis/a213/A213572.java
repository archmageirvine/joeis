package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213572.
 * @author Sean A. Irvine
 */
public class A213572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213572() {
    super(new long[] {-16, 68, -116, 101, -47, 11}, new long[] {1, 13, 82, 406, 1809, 7659});
  }
}
