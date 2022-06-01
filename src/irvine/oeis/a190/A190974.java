package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190974 a(n) = 7*a(n-1) - 5*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190974() {
    super(new long[] {-5, 7}, new long[] {0, 1});
  }
}
