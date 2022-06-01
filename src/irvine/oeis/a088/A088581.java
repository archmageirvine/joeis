package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088581 a(n) = n*x^n + (n-1)*x^(n-1) + . . . + x + 1 for x=3.
 * @author Sean A. Irvine
 */
public class A088581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088581() {
    super(new long[] {9, -15, 7}, new long[] {1, 4, 22});
  }
}
