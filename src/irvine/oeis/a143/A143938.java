package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143938 The Wiener index of a benzenoid consisting of a linear chain of n hexagons.
 * @author Sean A. Irvine
 */
public class A143938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143938() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 109, 279, 569});
  }
}
