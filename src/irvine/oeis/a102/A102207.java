package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102207 a(n) = 5a(n-1) - 5a(n-2) + a(n-3) with a(0) = 4, a(1) = 17, a(2) = 65.
 * @author Sean A. Irvine
 */
public class A102207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102207() {
    super(new long[] {1, -5, 5}, new long[] {4, 17, 65});
  }
}
