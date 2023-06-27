package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178222 Partial sums of floor(3^n/4).
 * @author Sean A. Irvine
 */
public class A178222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178222() {
    super(1, new long[] {3, -4, -2, 4}, new long[] {0, 2, 8, 28});
  }
}
