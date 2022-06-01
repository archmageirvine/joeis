package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033537 a(n) = n*(2*n+5).
 * @author Sean A. Irvine
 */
public class A033537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033537() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 18});
  }
}
