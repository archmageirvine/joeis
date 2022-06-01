package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088582 a(n) = n*x^n + (n-1)*x^(n-1) + . . . + x + 1 for x=4.
 * @author Sean A. Irvine
 */
public class A088582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088582() {
    super(new long[] {16, -24, 9}, new long[] {1, 5, 37});
  }
}
