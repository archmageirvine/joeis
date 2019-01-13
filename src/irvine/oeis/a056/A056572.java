package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056572.
 * @author Sean A. Irvine
 */
public class A056572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056572() {
    super(new long[] {1, 8, -40, -60, 40, 8}, new long[] {0, 1, 1, 32, 243, 3125});
  }
}
