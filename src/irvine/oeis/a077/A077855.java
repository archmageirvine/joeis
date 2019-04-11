package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077855 Expansion of <code>(1-x)^(-1)/(1 - 2*x + x^2 - x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077855() {
    super(new long[] {-1, 2, -3, 3}, new long[] {1, 3, 6, 11});
  }
}
