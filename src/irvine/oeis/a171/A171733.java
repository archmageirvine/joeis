package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171733.
 * @author Sean A. Irvine
 */
public class A171733 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171733() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {-1, 1, 1, 7, 31, 41, 137, 151, 391});
  }
}
