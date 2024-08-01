package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022976 a(n) = 20-n.
 * @author Sean A. Irvine
 */
public class A022976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022976() {
    super(new long[] {-1, 2}, new long[] {20, 19});
  }
}
