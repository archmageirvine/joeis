package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248338 10^n - 4^n.
 * @author Sean A. Irvine
 */
public class A248338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248338() {
    super(new long[] {-40, 14}, new long[] {0, 6});
  }
}
