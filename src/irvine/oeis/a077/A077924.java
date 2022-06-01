package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077924 Expansion of (1-x)^(-1)/(1+2*x-2*x^3).
 * @author Sean A. Irvine
 */
public class A077924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077924() {
    super(new long[] {-2, 2, 2, -1}, new long[] {1, -1, 3, -3});
  }
}
