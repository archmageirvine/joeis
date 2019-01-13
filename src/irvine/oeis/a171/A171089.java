package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171089.
 * @author Sean A. Irvine
 */
public class A171089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171089() {
    super(new long[] {-1, 2, 2}, new long[] {6, 4, 16});
  }
}
