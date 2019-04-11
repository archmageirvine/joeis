package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052921 Expansion of <code>(1-x)/(1-3*x+2*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052921() {
    super(new long[] {1, -2, 3}, new long[] {1, 2, 4});
  }
}
