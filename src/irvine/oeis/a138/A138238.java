package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138238 Alternating sum of the squares of the first n Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A138238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138238() {
    super(new long[] {-8, 2, 9, -2}, new long[] {0, 1, 0, 9});
  }
}
