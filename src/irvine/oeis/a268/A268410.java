package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268410 a(n) = a(n - 1) + a(n - 2) + a(n - 3) for n&gt;2, a(0)=5, a(1)=7, a(2)=9.
 * @author Sean A. Irvine
 */
public class A268410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268410() {
    super(new long[] {1, 1, 1}, new long[] {5, 7, 9});
  }
}
