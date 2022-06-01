package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082574 a(1)=1, a(n) = ceiling(r(3)*a(n-1)) where r(3) = (1/2)*(3 + sqrt(13)) is the positive root of X^2 = 3*X + 1.
 * @author Sean A. Irvine
 */
public class A082574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082574() {
    super(new long[] {-1, -2, 4}, new long[] {1, 4, 14});
  }
}
