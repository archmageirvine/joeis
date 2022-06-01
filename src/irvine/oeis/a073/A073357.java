package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073357 Binomial transform of tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A073357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073357() {
    super(new long[] {2, -4, 4}, new long[] {0, 1, 3});
  }
}
