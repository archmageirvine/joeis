package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219257 Numbers k such that 11*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219257() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 9, 13, 40, 48});
  }
}
