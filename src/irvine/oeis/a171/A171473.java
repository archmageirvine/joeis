package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171473.
 * @author Sean A. Irvine
 */
public class A171473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171473() {
    super(new long[] {8, -14, 7}, new long[] {35, 135, 527});
  }
}
