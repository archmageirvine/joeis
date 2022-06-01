package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195028 a(n) = n*(14*n + 13).
 * @author Sean A. Irvine
 */
public class A195028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195028() {
    super(new long[] {1, -3, 3}, new long[] {0, 27, 82});
  }
}
