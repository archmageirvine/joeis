package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052907 Expansion of 1/(1 - 2*x^2 - 2*x^3).
 * @author Sean A. Irvine
 */
public class A052907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052907() {
    super(new long[] {2, 2, 0}, new long[] {1, 0, 2});
  }
}
