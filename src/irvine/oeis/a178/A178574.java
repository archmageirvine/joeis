package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178574 a(n) = 2*n*(9*n-1).
 * @author Sean A. Irvine
 */
public class A178574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178574() {
    super(new long[] {1, -3, 3}, new long[] {16, 68, 156});
  }
}
