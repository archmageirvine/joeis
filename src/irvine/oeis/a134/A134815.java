package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134815 Expansion of g.f. -x*(3*x^7+2*x^6+x^5+15*x^4+3*x^3-x^2+15*x-4)/((x^4+x-1)*(x^4+5*x-1)).
 * @author Sean A. Irvine
 */
public class A134815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134815() {
    super(1, new long[] {-1, 0, 0, -6, 2, 0, -5, 6}, new long[] {4, 9, 35, 162, 790, 3923, 19602, 98108});
  }
}
