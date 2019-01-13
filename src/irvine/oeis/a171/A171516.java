package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171516.
 * @author Sean A. Irvine
 */
public class A171516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171516() {
    super(new long[] {-1, 0, 2}, new long[] {1, 2, 6});
  }
}
