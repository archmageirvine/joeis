package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226500 Triangular numbers representable as 3 * x^2.
 * @author Sean A. Irvine
 */
public class A226500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226500() {
    super(1, new long[] {1, -99, 99}, new long[] {0, 3, 300});
  }
}
