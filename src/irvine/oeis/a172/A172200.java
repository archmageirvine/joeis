package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172200.
 * @author Sean A. Irvine
 */
public class A172200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172200() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 20, 92});
  }
}
