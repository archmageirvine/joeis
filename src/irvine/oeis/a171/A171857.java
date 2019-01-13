package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171857.
 * @author Sean A. Irvine
 */
public class A171857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171857() {
    super(new long[] {1, 1, -1, 2}, new long[] {1, 2, 4, 8});
  }
}
