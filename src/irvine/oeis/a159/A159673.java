package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159673 Expansion of <code>56*x^2/(-x^3 + 783*x^2 - 783*x + 1)</code>.
 * @author Sean A. Irvine
 */
public class A159673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159673() {
    super(new long[] {1, -783, 783}, new long[] {0, 56, 43848});
  }
}
