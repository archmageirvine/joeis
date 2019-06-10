package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077846 Expansion of <code>1/(1 - 3*x + 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077846() {
    super(new long[] {-2, 0, 3}, new long[] {1, 3, 9});
  }
}
