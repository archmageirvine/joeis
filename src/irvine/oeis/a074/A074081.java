package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074081 Sum of determinants of 3rd order principal minors of powers of inverse of tetramatrix ((1,1,0,0),(1,0,1,0),(1,0,0,1),(1,0,0,0)).
 * @author Sean A. Irvine
 */
public class A074081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074081() {
    super(new long[] {1, -1, 1, -1}, new long[] {4, -1, 3, -7});
  }
}
