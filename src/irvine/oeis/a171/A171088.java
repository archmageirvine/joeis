package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171088.
 * @author Sean A. Irvine
 */
public class A171088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171088() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 0, 2});
  }
}
