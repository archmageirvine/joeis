package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178543 Partial sums of round(3^n/5).
 * @author Sean A. Irvine
 */
public class A178543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178543() {
    super(new long[] {3, -1, 3}, new long[] {0, 1, 3});
  }
}
