package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178872 Partial sums of round(4^n/7).
 * @author Sean A. Irvine
 */
public class A178872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178872() {
    super(new long[] {4, 3, 3}, new long[] {0, 1, 3});
  }
}
