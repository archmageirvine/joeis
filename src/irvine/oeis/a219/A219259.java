package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219259 Numbers k such that 25*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219259() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 23, 27, 96, 104});
  }
}
