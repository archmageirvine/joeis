package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022316 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0) = 0</code> and <code>a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A022316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022316() {
    super(new long[] {-1, 0, 2}, new long[] {0, 11, 12});
  }
}
