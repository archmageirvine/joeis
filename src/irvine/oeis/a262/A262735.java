package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262735 Expansion of x*(1-x-x^2)/((1-x)*(1-x-2*x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A262735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262735() {
    super(new long[] {-1, -1, 1, 2}, new long[] {0, 1, 1, 2});
  }
}
