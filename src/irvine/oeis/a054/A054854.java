package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054854.
 * @author Sean A. Irvine
 */
public class A054854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054854() {
    super(new long[] {-2, 3, 2}, new long[] {1, 1, 5});
  }
}
