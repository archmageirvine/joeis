package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171648.
 * @author Sean A. Irvine
 */
public class A171648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171648() {
    super(new long[] {4, 0, 2, 0}, new long[] {1, 2, 2, 4});
  }
}
