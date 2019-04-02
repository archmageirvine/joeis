package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033429 a(n) = 5*n^2.
 * @author Sean A. Irvine
 */
public class A033429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033429() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 20});
  }
}
