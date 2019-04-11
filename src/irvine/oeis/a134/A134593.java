package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134593 <code>a(n) = 5*n^2 + 10*n + 1</code>. Coefficients of the rational part of <code>(1 + sqrt(n))^5</code>.
 * @author Sean A. Irvine
 */
public class A134593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134593() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 41});
  }
}
