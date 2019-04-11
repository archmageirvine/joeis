package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052546 Expansion of <code>(1-x)/(1-x-x^2-2x^3+2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052546() {
    super(new long[] {-2, 2, 1, 1}, new long[] {1, 0, 1, 3});
  }
}
