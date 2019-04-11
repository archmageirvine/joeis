package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272850 <code>a(n) = (n^2 + (n+1)^2)*(n^2 + (n+1)^2 + 2*n*(n+1))</code>.
 * @author Sean A. Irvine
 */
public class A272850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272850() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 45, 325, 1225, 3321});
  }
}
