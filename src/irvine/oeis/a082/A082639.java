package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082639 Numbers k such that 2*k*(k+2) is a square.
 * @author Sean A. Irvine
 */
public class A082639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082639() {
    super(1, new long[] {1, -7, 7}, new long[] {0, 2, 16});
  }
}
