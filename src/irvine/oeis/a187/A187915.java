package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187915 a(n) = (1/2)*((n+2)*P(n-1)+(5*n+1)*P(n)) where P() = A000129 are the Pell numbers.
 * @author Sean A. Irvine
 */
public class A187915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187915() {
    super(new long[] {-1, -4, -2, 4}, new long[] {3, 13, 45, 141});
  }
}
