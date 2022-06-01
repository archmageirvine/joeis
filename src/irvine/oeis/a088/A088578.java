package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088578 a(n) = n*x^n + (n-1)*x^(n-1) + . . . + x + 1 for x=2.
 * @author Sean A. Irvine
 */
public class A088578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088578() {
    super(new long[] {4, -8, 5}, new long[] {1, 3, 11});
  }
}
