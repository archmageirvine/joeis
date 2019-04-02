package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024394 a(n) = sum of squares of first n positive integers congruent to 2 mod 3.
 * @author Sean A. Irvine
 */
public class A024394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024394() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 29, 93, 214});
  }
}
