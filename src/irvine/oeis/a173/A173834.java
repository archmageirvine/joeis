package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173834 a(n)=10^n-2*n.
 * @author Sean A. Irvine
 */
public class A173834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173834() {
    super(new long[] {10, -21, 12}, new long[] {1, 8, 96});
  }
}
