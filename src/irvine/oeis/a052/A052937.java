package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052937 Expansion of <code>(2-3*x-x^2)/((1-x)*(1-2*x-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A052937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052937() {
    super(new long[] {-1, -1, 3}, new long[] {2, 3, 6});
  }
}
