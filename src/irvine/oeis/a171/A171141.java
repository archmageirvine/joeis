package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171141.
 * @author Sean A. Irvine
 */
public class A171141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171141() {
    super(new long[] {-1, 1, 1}, new long[] {6, 33, 47});
  }
}
