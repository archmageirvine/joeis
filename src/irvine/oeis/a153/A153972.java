package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153972 a(n) = 2^n + 6.
 * @author Sean A. Irvine
 */
public class A153972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153972() {
    super(new long[] {-2, 3}, new long[] {7, 8});
  }
}
