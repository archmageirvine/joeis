package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077616 Binomial transform of n^2*2^n/2.
 * @author Sean A. Irvine
 */
public class A077616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077616() {
    super(1, new long[] {27, -27, 9}, new long[] {1, 10, 63});
  }
}
