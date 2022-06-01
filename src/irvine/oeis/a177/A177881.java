package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177881 Partial sums of round(3^n/10).
 * @author Sean A. Irvine
 */
public class A177881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177881() {
    super(new long[] {-3, 4, -4, 4}, new long[] {0, 0, 1, 4});
  }
}
