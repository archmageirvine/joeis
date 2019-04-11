package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022317 <code>a(n) = a(n-1) + a(n-2) + 1,</code> with <code>a(0) = 0</code> and <code>a(1) = 12</code>.
 * @author Sean A. Irvine
 */
public class A022317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022317() {
    super(new long[] {-1, 0, 2}, new long[] {0, 12, 13});
  }
}
