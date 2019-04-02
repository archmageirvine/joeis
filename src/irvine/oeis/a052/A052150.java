package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052150 Partial sums of A000340, second partial sums of A003462.
 * @author Sean A. Irvine
 */
public class A052150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052150() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 6, 24, 82});
  }
}
