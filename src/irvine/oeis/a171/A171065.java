package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171065.
 * @author Sean A. Irvine
 */
public class A171065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171065() {
    super(new long[] {-1, 1, 8, 1}, new long[] {0, 1, 1, 8});
  }
}
