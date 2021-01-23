package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033573 a(n) = (2*n+1)*(9*n+1).
 * @author Sean A. Irvine
 */
public class A033573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033573() {
    super(new long[] {1, -3, 3}, new long[] {1, 30, 95});
  }
}
