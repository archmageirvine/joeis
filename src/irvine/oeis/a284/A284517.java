package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284517 Periodic with period <code>[1, 4, 3, 4, 1, 6]</code> of length 6.
 * @author Sean A. Irvine
 */
public class A284517 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284517() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 4, 3, 4});
  }
}
