package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077912 Expansion of 1/(1+x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077912() {
    super(new long[] {2, -1, 0}, new long[] {1, 0, -1});
  }
}
