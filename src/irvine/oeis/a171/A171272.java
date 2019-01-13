package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171272.
 * @author Sean A. Irvine
 */
public class A171272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171272() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 25, 77});
  }
}
