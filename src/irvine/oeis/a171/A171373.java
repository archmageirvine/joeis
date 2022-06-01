package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171373 Binomial transform of A171372.
 * @author Sean A. Irvine
 */
public class A171373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171373() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {1, 6, 16, 36, 76});
  }
}
