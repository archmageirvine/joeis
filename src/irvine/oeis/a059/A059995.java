package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059995 Drop the final digit of n.
 * @author Sean A. Irvine
 */
public class A059995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059995() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
