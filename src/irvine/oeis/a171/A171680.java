package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171680.
 * @author Sean A. Irvine
 */
public class A171680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171680() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {1, -1, 16, 353, 6535});
  }
}
