package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069007 Let M denote the 6 X 6 matrix with rows /1,1,1,1,1,1/1,1,1,1,1,0/1,1,1,1,0,0/1,1,1,0,0,0/1,1,0,0,0,0/1,0,0,0,0,0/ and A(n) the vector (x(n),y(n),z(n),t(n),u(n),v(n)) = M^n*A where A is the vector (1,1,1,1,1,1); then a(n) = y(n).
 * @author Sean A. Irvine
 */
public class A069007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069007() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 5, 20, 85, 350, 1456});
  }
}
