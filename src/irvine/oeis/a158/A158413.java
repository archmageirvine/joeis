package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158413 961n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158413() {
    super(new long[] {1, -3, 3}, new long[] {963, 3848, 8655});
  }
}
