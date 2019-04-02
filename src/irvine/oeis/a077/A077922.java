package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077922 Expansion of (1-x)^(-1)/(1+2*x-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A077922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077922() {
    super(new long[] {1, -2, 3, -1}, new long[] {1, -1, 4, -9});
  }
}
