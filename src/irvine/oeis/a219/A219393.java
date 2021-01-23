package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219393 Numbers k such that 23*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219393() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 21, 25, 88, 96});
  }
}
