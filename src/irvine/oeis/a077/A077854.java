package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077854 Expansion of 1/((1-x)*(1-2*x)*(1+x^2)).
 * @author Sean A. Irvine
 */
public class A077854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077854() {
    super(new long[] {-2, 3, -3, 3}, new long[] {1, 3, 6, 12});
  }
}
