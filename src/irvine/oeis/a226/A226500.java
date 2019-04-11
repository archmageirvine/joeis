package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226500 Triangular numbers representable as <code>3 * x^2</code>.
 * @author Sean A. Irvine
 */
public class A226500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226500() {
    super(new long[] {1, -99, 99}, new long[] {0, 3, 300});
  }
}
