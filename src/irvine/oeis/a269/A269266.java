package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269266 a(n) = 2^n mod 31.
 * @author Sean A. Irvine
 */
public class A269266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269266() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 2, 4, 8, 16});
  }
}
