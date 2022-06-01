package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077843 Expansion of (1-x)/(1-2*x-2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077843() {
    super(new long[] {2, 2, 2}, new long[] {1, 1, 4});
  }
}
