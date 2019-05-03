package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082585 <code>a(1)=1, a(n) = ceiling(r(5)*a(n-1))</code> where <code>r(5) = (1/2)*(5 + sqrt(29))</code> is the positive root of <code>X^2 = 5*X + 1</code>.
 * @author Sean A. Irvine
 */
public class A082585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082585() {
    super(new long[] {-1, -4, 6}, new long[] {1, 6, 32});
  }
}
