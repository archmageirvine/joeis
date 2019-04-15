package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081896 A sequence related to <code>binomial(n+3, 3)</code>.
 * @author Sean A. Irvine
 */
public class A081896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081896() {
    super(new long[] {-256, 256, -96, 16}, new long[] {1, 7, 43, 245});
  }
}
