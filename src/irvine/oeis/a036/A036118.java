package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036118 a(n) = 2^n mod 13.
 * @author Sean A. Irvine
 */
public class A036118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036118() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 8, 3, 6, 12});
  }
}
