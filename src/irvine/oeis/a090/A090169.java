package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090169 a(n) = floor( 3*n/2 ) + floor( 2*n/3 ).
 * @author Sean A. Irvine
 */
public class A090169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090169() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {0, 1, 4, 6, 8});
  }
}
