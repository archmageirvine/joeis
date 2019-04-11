package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052958 G.f.: <code>(1-x)/(1-3*x-2*x^3+2*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052958() {
    super(new long[] {-2, 2, 0, 3}, new long[] {1, 2, 6, 20});
  }
}
