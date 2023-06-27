package irvine.oeis.a068;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A068397 a(n) = Lucas(n) + (-1)^n + 1.
 * @author Sean A. Irvine
 */
public class A068397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068397() {
    super(1, new long[] {-1, -1, 2, 1}, new long[] {1, 5, 4, 9});
  }
}
