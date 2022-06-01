package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111666 Expansion of (-2+3*x+3*x^2+4*x^3+3*x^4-5*x^5)/((x-1)*(x+1)*(1+x^2)*(x^2-3*x+1)).
 * @author Sean A. Irvine
 */
public class A111666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111666() {
    super(new long[] {1, -3, 1, 0, -1, 3}, new long[] {2, 3, 4, 5, 10, 27});
  }
}
