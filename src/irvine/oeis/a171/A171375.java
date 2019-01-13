package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171375.
 * @author Sean A. Irvine
 */
public class A171375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171375() {
    super(new long[] {1000, -1110, 111}, new long[] {5, 131, 10301});
  }
}
