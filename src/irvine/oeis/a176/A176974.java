package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176974 First exponent n to generate maximum remainder when (a + 1)^n + (a - 1)^n is divided by a^2 for variable n and a&gt;2.
 * @author Sean A. Irvine
 */
public class A176974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176974() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 7, 5, 3, 3, 13, 9});
  }
}
