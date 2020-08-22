package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052981 Expansion of  ( 1-x ) / ( 1-4*x-3*x^2+3*x^3 ).
 * @author Sean A. Irvine
 */
public class A052981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052981() {
    super(new long[] {-3, 3, 4}, new long[] {1, 3, 15});
  }
}
