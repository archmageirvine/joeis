package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022974 a(n) = 18-n.
 * @author Sean A. Irvine
 */
public class A022974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022974() {
    super(new long[] {-1, 2}, new long[] {18, 17});
  }
}
