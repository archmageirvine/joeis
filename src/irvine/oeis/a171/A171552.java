package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171552.
 * @author Sean A. Irvine
 */
public class A171552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171552() {
    super(new long[] {-16, 8, 0, 2}, new long[] {1, 2, 0, -8});
  }
}
