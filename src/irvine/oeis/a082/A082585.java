package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082585 <code>a(1)=1, a(n) =</code> ceiling(r(5)*a(n-1)) where r(5) <code>= (1/2)*(5 + sqrt(29))</code> is the positive root of X^2 = 5*X <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A082585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082585() {
    super(new long[] {-1, -4, 6}, new long[] {1, 6, 32});
  }
}
