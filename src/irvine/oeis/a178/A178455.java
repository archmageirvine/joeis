package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178455 Partial sums of floor(2^n/7).
 * @author Sean A. Irvine
 */
public class A178455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178455() {
    super(new long[] {2, -3, 1, -2, 3}, new long[] {0, 0, 0, 1, 3});
  }
}
