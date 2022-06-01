package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178710 Partial sums of floor(4^n/7).
 * @author Sean A. Irvine
 */
public class A178710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178710() {
    super(new long[] {4, -5, 1, -4, 5}, new long[] {0, 2, 11, 47, 193});
  }
}
