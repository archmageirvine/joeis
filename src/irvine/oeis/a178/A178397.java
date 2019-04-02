package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178397 Partial sums of round(7^n/10).
 * @author Sean A. Irvine
 */
public class A178397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178397() {
    super(new long[] {-7, 8, -8, 8}, new long[] {0, 1, 6, 40});
  }
}
