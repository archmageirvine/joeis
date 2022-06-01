package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171621 Numerator of 1/4 - 1/n^2, each fourth term multiplied by 4.
 * @author Sean A. Irvine
 */
public class A171621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171621() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 5, 3, 21, 8, 45});
  }
}
