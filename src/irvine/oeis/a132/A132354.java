package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132354 Integers m such that 7*m <code>+ 1</code> is a square.
 * @author Sean A. Irvine
 */
public class A132354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132354() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 9, 24, 32});
  }
}
