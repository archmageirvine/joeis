package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016900 a(n) = (5*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A016900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016900() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 6561, 38416, 130321, 331776});
  }
}
