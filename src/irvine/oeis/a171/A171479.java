package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171479.
 * @author Sean A. Irvine
 */
public class A171479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171479() {
    super(new long[] {8, -14, 7}, new long[] {1, 8, 43});
  }
}
