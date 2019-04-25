package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069008 Let M denote the 6 X 6 matrix with rows <code>/1,1,1,1,1,1/1,1,1,1,1,0/1,1,1,1,0,0/1,1,1,0,0,0/1,1,0,0,0,0/1,0,0,0,0,0/</code> and A(n) the vector <code>(x(n),y(n),z(n)</code>,t(n),u(n),v(n)) = M^n*A where A is the vector <code>(1,1,1,1,1,1)</code>; then <code>a(n) = z(n)</code>.
 * @author Sean A. Irvine
 */
public class A069008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069008() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 4, 18, 74, 309, 1280});
  }
}
