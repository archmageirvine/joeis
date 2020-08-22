package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052953 Expansion of 2*(1-x-x^2)/((1-x)*(1+x)*(1-2*x)).
 * @author Sean A. Irvine
 */
public class A052953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052953() {
    super(new long[] {-2, 1, 2}, new long[] {2, 2, 4});
  }
}
