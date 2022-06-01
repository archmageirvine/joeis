package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052533 Expansion of (1-x)/(1-x-3*x^2).
 * @author Sean A. Irvine
 */
public class A052533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052533() {
    super(new long[] {3, 1}, new long[] {1, 0});
  }
}
