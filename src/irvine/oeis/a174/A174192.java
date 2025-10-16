package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174192 Expansion of g.f. (1-x+2*x^2)/((1-x)*(1-2*x-x^2)).
 * @author Sean A. Irvine
 */
public class A174192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174192() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 7});
  }
}
