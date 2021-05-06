package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033585 a(n) = 2*n*(4*n + 1).
 * @author Sean A. Irvine
 */
public class A033585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033585() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 36});
  }
}
