package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052551 Expansion of 1/((1 - x)*(1 - 2*x^2)).
 * @author Sean A. Irvine
 */
public class A052551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052551() {
    super(new long[] {-2, 2, 1}, new long[] {1, 1, 3});
  }
}
