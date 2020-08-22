package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158129 100n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158129() {
    super(new long[] {1, -3, 3}, new long[] {98, 396, 894});
  }
}
