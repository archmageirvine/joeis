package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052975 Expansion of (1-2*x)*(1-x)/(1-5*x+6*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A052975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052975() {
    super(new long[] {1, -6, 5}, new long[] {1, 2, 6});
  }
}
