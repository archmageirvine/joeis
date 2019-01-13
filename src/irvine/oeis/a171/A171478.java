package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171478.
 * @author Sean A. Irvine
 */
public class A171478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171478() {
    super(new long[] {8, -14, 7}, new long[] {1, 8, 42});
  }
}
