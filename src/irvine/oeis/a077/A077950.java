package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077950 Expansion of 1/(1-x+2*x^3).
 * @author Sean A. Irvine
 */
public class A077950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077950() {
    super(new long[] {-2, 0, 1}, new long[] {1, 1, 1});
  }
}
