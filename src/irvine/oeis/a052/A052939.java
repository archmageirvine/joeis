package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052939 Expansion of <code>(1-x)*(1+x)/(1-3*x-x^2+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052939() {
    super(new long[] {-2, 1, 3}, new long[] {1, 3, 9});
  }
}
