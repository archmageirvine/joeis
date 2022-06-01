package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008647 Expansion of g.f.: (1+x^9)/((1-x^4)*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A008647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008647() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1});
  }
}

