package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152268 Expansion of g.f. x/(1-7*x+8*x^2).
 * @author Sean A. Irvine
 */
public class A152268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152268() {
    super(new long[] {-8, 7}, new long[] {0, 1});
  }
}
