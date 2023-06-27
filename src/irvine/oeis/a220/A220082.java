package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220082 Numbers k such that 10*k-1 is a square.
 * @author Sean A. Irvine
 */
public class A220082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220082() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 5, 17, 29, 53});
  }
}
