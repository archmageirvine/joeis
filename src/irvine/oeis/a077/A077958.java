package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077958 Expansion of 1/(1-2*x^3).
 * @author Sean A. Irvine
 */
public class A077958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077958() {
    super(new long[] {2, 0, 0}, new long[] {1, 0, 0});
  }
}
