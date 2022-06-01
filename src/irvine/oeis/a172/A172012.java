package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172012 Expansion of (2-3*x)/(1-3*x-3*x^2) .
 * @author Sean A. Irvine
 */
public class A172012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172012() {
    super(new long[] {3, 3}, new long[] {2, 3});
  }
}
