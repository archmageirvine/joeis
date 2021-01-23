package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052546 Expansion of (1-x)/(1-x-x^2-2*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A052546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052546() {
    super(new long[] {-2, 2, 1, 1}, new long[] {1, 0, 1, 3});
  }
}
