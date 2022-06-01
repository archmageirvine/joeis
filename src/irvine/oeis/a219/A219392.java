package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219392 Numbers k such that 22*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219392() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 20, 24, 84, 92});
  }
}
