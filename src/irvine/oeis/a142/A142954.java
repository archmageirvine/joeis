package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142954 a(n) = 2*n + 3 + 3*(-1)^n.
 * @author Sean A. Irvine
 */
public class A142954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142954() {
    super(1, new long[] {-1, 1, 1}, new long[] {2, 10, 6});
  }
}
