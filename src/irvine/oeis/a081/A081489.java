package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081489 <code>a(n) = n*(2*n^2 -3*n +7)/6 = C(n, 1) + C(n, 2) + 2*C(n, 3)</code>.
 * @author Sean A. Irvine
 */
public class A081489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081489() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 8, 18});
  }
}
