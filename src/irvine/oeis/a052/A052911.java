package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052911 Expansion of <code>(1-x)/(1-3x-x^2+2x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052911() {
    super(new long[] {-2, 1, 3}, new long[] {1, 2, 7});
  }
}
