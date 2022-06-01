package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219394 Numbers k such that 17*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A219394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219394() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 15, 19, 64, 72});
  }
}
