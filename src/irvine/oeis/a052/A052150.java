package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052150 Partial sums of <code>A000340</code>, second partial sums of <code>A003462</code>.
 * @author Sean A. Irvine
 */
public class A052150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052150() {
    super(new long[] {-3, 10, -12, 6}, new long[] {1, 6, 24, 82});
  }
}
