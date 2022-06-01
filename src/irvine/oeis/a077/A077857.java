package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077857 Expansion of (1-x)^(-1)/(1-2*x+x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077857() {
    super(new long[] {2, -1, -3, 3}, new long[] {1, 3, 6, 8});
  }
}
