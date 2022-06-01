package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028860 a(n+2) = 2*a(n+1) + 2*a(n); a(0) = -1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A028860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028860() {
    super(new long[] {2, 2}, new long[] {-1, 1});
  }
}
