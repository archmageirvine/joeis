package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248800 a(n) = (2*n^2 + 3 + (-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A248800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248800() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 2, 6, 10});
  }
}
