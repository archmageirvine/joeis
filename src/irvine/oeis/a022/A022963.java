package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022963 a(n) = 7-n.
 * @author Sean A. Irvine
 */
public class A022963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022963() {
    super(new long[] {-1, 2}, new long[] {7, 6});
  }
}
