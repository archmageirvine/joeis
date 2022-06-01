package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083220 a(n) = n + (n mod 4).
 * @author Sean A. Irvine
 */
public class A083220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083220() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 6, 4});
  }
}
