package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226503 Expansion of g.f. x*(1+x+x^2)/(1-x^3-x^5).
 * @author Sean A. Irvine
 */
public class A226503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226503() {
    super(new long[] {1, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
