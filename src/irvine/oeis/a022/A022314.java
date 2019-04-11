package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022314 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0) = 0, a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A022314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022314() {
    super(new long[] {-1, 0, 2}, new long[] {0, 9, 10});
  }
}
