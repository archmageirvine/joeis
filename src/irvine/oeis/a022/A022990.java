package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022990 a(n) = 34-n.
 * @author Sean A. Irvine
 */
public class A022990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022990() {
    super(new long[] {-1, 2}, new long[] {34, 33});
  }
}
