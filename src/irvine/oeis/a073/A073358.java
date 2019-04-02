package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073358 Binomial transform, alternating in sign, of the tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A073358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073358() {
    super(new long[] {-2, 0, 2}, new long[] {0, -1, -1});
  }
}
