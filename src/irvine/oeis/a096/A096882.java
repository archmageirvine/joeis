package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096882 Expansion of g.f. (1 + 7*x)/(1 - 50*x^2).
 * @author Sean A. Irvine
 */
public class A096882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096882() {
    super(new long[] {50, 0}, new long[] {1, 7});
  }
}
