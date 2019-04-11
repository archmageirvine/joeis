package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052990 Expansion of <code>( 1-x ) / ( 1-4*x-x^2+2*x^3 )</code>.
 * @author Sean A. Irvine
 */
public class A052990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052990() {
    super(new long[] {-2, 1, 4}, new long[] {1, 3, 13});
  }
}
