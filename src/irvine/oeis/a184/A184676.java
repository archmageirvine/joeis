package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184676 <code>a(n) = n + floor((n/2-1/(4*n))^2)</code>; complement of A183867.
 * @author Sean A. Irvine
 */
public class A184676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184676() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 5, 7});
  }
}
