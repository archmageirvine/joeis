package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077864 Expansion of (1-x)^(-1)/(1-x-2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077864() {
    super(new long[] {-1, -1, 1, 2}, new long[] {1, 2, 5, 11});
  }
}
