package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171068.
 * @author Sean A. Irvine
 */
public class A171068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171068() {
    super(new long[] {-1, 1, 11, 1}, new long[] {0, 1, 1, 11});
  }
}
