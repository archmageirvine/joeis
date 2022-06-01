package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288834 a(n) = (n+1) * 3^(n-1).
 * @author Sean A. Irvine
 */
public class A288834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288834() {
    super(new long[] {-9, 6}, new long[] {2, 9});
  }
}
