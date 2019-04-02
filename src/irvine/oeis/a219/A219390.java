package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219390 Numbers k such that 14*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219390() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 12, 16, 52, 60});
  }
}
