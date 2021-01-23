package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178704 Partial sums of floor(3^n/7).
 * @author Sean A. Irvine
 */
public class A178704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178704() {
    super(new long[] {3, -7, 5, 2, -7, 5}, new long[] {0, 0, 1, 4, 15, 49});
  }
}
