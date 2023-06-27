package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184676 a(n) = n + floor((n/2-1/(4*n))^2); complement of A183867.
 * @author Sean A. Irvine
 */
public class A184676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184676() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {1, 2, 5, 7});
  }
}
