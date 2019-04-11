package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218395 If the sum of the squares of 11 consecutive numbers is a square, then <code>a(n)</code> is the square root of this sum.
 * @author Sean A. Irvine
 */
public class A218395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218395() {
    super(new long[] {-1, 0, 20, 0}, new long[] {11, 77, 143, 1529});
  }
}
