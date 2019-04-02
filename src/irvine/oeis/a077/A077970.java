package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077970 Expansion of 1/(1+x-2*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077970() {
    super(new long[] {-2, 2, -1}, new long[] {1, -1, 3});
  }
}
