package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171064.
 * @author Sean A. Irvine
 */
public class A171064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171064() {
    super(new long[] {-1, 1, 7, 1}, new long[] {0, 1, 1, 7});
  }
}
