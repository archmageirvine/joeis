package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020572 Expansion of g.f. 1/((1 - 6*x)*(1 - 7*x)*(1 - 10*x)).
 * @author Sean A. Irvine
 */
public class A020572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020572() {
    super(new long[] {420, -172, 23}, new long[] {1, 23, 357});
  }
}
