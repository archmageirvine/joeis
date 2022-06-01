package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083219 a(n) = n - 2*floor(n/4).
 * @author Sean A. Irvine
 */
public class A083219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083219() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 2, 3, 2});
  }
}
