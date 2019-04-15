package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081907 A sequence related to <code>binomial(n+2, 2)</code>.
 * @author Sean A. Irvine
 */
public class A081907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081907() {
    super(new long[] {216, -108, 18}, new long[] {1, 8, 61});
  }
}
