package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052948 G.f.: <code>(1-2*x)/(1-3*x+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052948() {
    super(new long[] {-2, 0, 3}, new long[] {1, 1, 3});
  }
}
