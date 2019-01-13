package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256493.
 * @author Sean A. Irvine
 */
public class A256493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256493() {
    super(new long[] {20, -32, 13}, new long[] {1, 3, 19});
  }
}
