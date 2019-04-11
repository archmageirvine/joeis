package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077941 Expansion of <code>1/(1-2*x+x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077941() {
    super(new long[] {-1, -1, 2}, new long[] {1, 2, 3});
  }
}
