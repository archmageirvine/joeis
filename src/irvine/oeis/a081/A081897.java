package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081897 A sequence related to <code>binomial(n+3, 3)</code>.
 * @author Sean A. Irvine
 */
public class A081897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081897() {
    super(new long[] {-625, 500, -150, 20}, new long[] {1, 8, 58, 396});
  }
}
