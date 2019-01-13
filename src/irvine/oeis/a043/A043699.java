package irvine.oeis.a043;

import irvine.oeis.LinearRecurrence;

/**
 * A043699.
 * @author Sean A. Irvine
 */
public class A043699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A043699() {
    super(new long[] {-1, -12, 30, 12}, new long[] {0, 2, 24, 350});
  }
}
