package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219395 Numbers k such that 18*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219395() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 16, 20, 68, 76});
  }
}
