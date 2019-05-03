package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173834 <code>a(n)=10^n-2*n</code>.
 * @author Sean A. Irvine
 */
public class A173834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173834() {
    super(new long[] {10, -21, 12}, new long[] {1, 8, 96});
  }
}
