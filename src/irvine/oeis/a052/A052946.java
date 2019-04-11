package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052946 Expansion of <code>(1-x)^2/(1-3x+2x^3-x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052946() {
    super(new long[] {1, -2, 0, 3}, new long[] {1, 1, 4, 10});
  }
}
