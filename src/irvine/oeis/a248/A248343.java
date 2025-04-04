package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248343 a(n) = 10^n - 8^n.
 * @author Sean A. Irvine
 */
public class A248343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248343() {
    super(new long[] {-80, 18}, new long[] {0, 2});
  }
}
