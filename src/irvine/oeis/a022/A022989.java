package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022989 a(n) = 33-n.
 * @author Sean A. Irvine
 */
public class A022989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022989() {
    super(new long[] {-1, 2}, new long[] {33, 32});
  }
}
