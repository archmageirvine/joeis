package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195084 a(2n-1) = 2-n, a(2n) = 2+n.
 * @author Sean A. Irvine
 */
public class A195084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195084() {
    super(1, new long[] {1, 1, -1}, new long[] {1, 3, 0});
  }
}
