package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069007 Let M denote the <code>6 X 6</code> matrix with rows /1,1,1,1,1,1/1,1,1,1,1,0/1,1,1,1,0,0/1,1,1,0,0,0/1,1,0,0,0,0/1,0,0,0,0,0/ and <code>A(n)</code> the vector <code>(x(n),y(n),z(n),t(n),u(n),v(n)) = M^n*A</code> where A is the vector <code>(1,1,1,1,1,1);</code> then <code>a(n) = y(n)</code>.
 * @author Sean A. Irvine
 */
public class A069007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069007() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 5, 20, 85, 350, 1456});
  }
}
