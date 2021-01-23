package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204221 Integers of the form (n^2 - 1) / 15.
 * @author Sean A. Irvine
 */
public class A204221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204221() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 8, 13, 17, 24, 45, 56, 64});
  }
}
