package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164582 a(n) = 5*a(n - 1) - a(n - 2), with n&gt;2, a(1)=2, a(2)=3.
 * @author Sean A. Irvine
 */
public class A164582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164582() {
    super(new long[] {-1, 5}, new long[] {2, 3});
  }
}
