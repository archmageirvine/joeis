package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052962 Expansion of <code>(1-2x^2)/(1-x-3x^2+2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052962() {
    super(new long[] {-2, 0, 3, 1}, new long[] {1, 1, 2, 5});
  }
}
