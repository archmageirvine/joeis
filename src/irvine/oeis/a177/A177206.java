package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177206 a(n) = 2*binomial(n+4, 4) + n + 4.
 * @author Sean A. Irvine
 */
public class A177206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177206() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 15, 36, 77, 148});
  }
}
