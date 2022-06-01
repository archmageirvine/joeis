package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022403 a(0)=a(1)=3; thereafter a(n) = a(n-1) + a(n-2) + 1.
 * @author Sean A. Irvine
 */
public class A022403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022403() {
    super(new long[] {-1, 0, 2}, new long[] {3, 3, 7});
  }
}
