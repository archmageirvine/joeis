package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178706 Partial sums of floor(3^n/5).
 * @author Sean A. Irvine
 */
public class A178706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178706() {
    super(new long[] {3, -7, 8, -8, 5}, new long[] {0, 1, 6, 22, 70});
  }
}
