package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022309 a(n) = a(n-1) + a(n-2) + 1 for n&gt;1, a(0)=0, a(1)=4.
 * @author Sean A. Irvine
 */
public class A022309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022309() {
    super(new long[] {-1, 0, 2}, new long[] {0, 4, 5});
  }
}
