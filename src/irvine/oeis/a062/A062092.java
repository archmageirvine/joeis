package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062092 a(n) = 2*a(n-1)-(-1)^n for n&gt;0, a(0)=2.
 * @author Sean A. Irvine
 */
public class A062092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062092() {
    super(new long[] {2, 1}, new long[] {2, 5});
  }
}
