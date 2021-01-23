package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226511 3*(5^n-3^n)/2.
 * @author Sean A. Irvine
 */
public class A226511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226511() {
    super(new long[] {-15, 8}, new long[] {0, 3});
  }
}
