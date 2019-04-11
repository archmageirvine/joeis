package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077915 Expansion of <code>1/((1-x)*(1+2*x-2*x^2-2*x^3))</code>.
 * @author Sean A. Irvine
 */
public class A077915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077915() {
    super(new long[] {-2, 0, 4, -1}, new long[] {1, -1, 5, -9});
  }
}
