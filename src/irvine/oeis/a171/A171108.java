package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171108.
 * @author Sean A. Irvine
 */
public class A171108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171108() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 21, 225, 882});
  }
}
