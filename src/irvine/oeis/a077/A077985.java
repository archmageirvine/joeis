package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077985 Expansion of 1/(1 + 2*x - x^2).
 * @author Sean A. Irvine
 */
public class A077985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077985() {
    super(new long[] {1, -2}, new long[] {1, -2});
  }
}
