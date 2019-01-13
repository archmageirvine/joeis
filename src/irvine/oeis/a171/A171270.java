package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171270.
 * @author Sean A. Irvine
 */
public class A171270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171270() {
    super(new long[] {6, -11, 6}, new long[] {3, 11, 33});
  }
}
