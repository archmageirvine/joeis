package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082574 <code>a(1)=1, a(n) = ceiling(r(3)*a(n-1))</code> where <code>r(3) = (1/2)*(3 + sqrt(13))</code> is the positive root of X^2 = 3*X <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A082574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082574() {
    super(new long[] {-1, -2, 4}, new long[] {1, 4, 14});
  }
}
