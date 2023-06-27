package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158271 324n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158271() {
    super(1, new long[] {1, -3, 3}, new long[] {326, 1300, 2922});
  }
}
