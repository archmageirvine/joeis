package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171410.
 * @author Sean A. Irvine
 */
public class A171410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171410() {
    super(new long[] {1000, -1110, 111}, new long[] {7, 151, 10501});
  }
}
