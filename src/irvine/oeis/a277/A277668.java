package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277668.
 * @author Sean A. Irvine
 */
public class A277668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277668() {
    super(new long[] {1, -2, 3, -4, 5}, new long[] {1, 5, 21, 88, 369});
  }
}
