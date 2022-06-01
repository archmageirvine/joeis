package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248337 6^n - 4^n.
 * @author Sean A. Irvine
 */
public class A248337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248337() {
    super(new long[] {-24, 10}, new long[] {0, 2});
  }
}
