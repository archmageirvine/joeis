package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052933 Expansion of <code>(1-x^2)/(1 - x - 3*x^2 + 2*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052933 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052933() {
    super(new long[] {-2, 0, 3, 1}, new long[] {1, 1, 3, 6});
  }
}
