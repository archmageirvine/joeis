package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069006 Let M denote the 5 X 5 matrix with rows /1,1,1,1,1/1,1,1,1,0/1,1,1,0,0/1,1,0,0,0/1,0,0,0,0/ and A(n) = vector (x(n),y(n),z(n),t(n),u(n)) = M^n*A where A is the vector (1,1,1,1,1); then a(n) = t(n).
 * @author Sean A. Irvine
 */
public class A069006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069006() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 2, 9, 29, 105});
  }
}
