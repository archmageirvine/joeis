package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248217 a(n) = 8^n - 2^n.
 * @author Sean A. Irvine
 */
public class A248217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248217() {
    super(new long[] {-16, 10}, new long[] {0, 6});
  }
}
