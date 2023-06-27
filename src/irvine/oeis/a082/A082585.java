package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082585 a(1)=1, a(n) = ceiling(r(5)*a(n-1)) where r(5) = (1/2)*(5 + sqrt(29)) is the positive root of X^2 = 5*X + 1.
 * @author Sean A. Irvine
 */
public class A082585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082585() {
    super(1, new long[] {-1, -4, 6}, new long[] {1, 6, 32});
  }
}
