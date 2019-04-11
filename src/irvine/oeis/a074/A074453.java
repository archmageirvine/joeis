package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074453 Sum of determinants of 2nd order principal minors of powers of inverse of Tetramatrix <code>((1,1,0,0),(1,0,1,0),(1,0,0,1),(1,0,0,0))</code>.
 * @author Sean A. Irvine
 */
public class A074453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074453() {
    super(new long[] {1, 1, 2, 2, -2, 1}, new long[] {6, 1, -3, 1, 17, 16});
  }
}
