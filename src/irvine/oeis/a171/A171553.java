package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171553.
 * @author Sean A. Irvine
 */
public class A171553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171553() {
    super(new long[] {1000, -1110, 111}, new long[] {11, 191, 10901});
  }
}
