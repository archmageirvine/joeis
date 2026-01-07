package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263942 Positive integers m such that (m+4)^3 - m^3 is a square.
 * @author Sean A. Irvine
 */
public class A263942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263942() {
    super(1, new long[] {1, -5, 5}, new long[] {6, 28, 110});
  }
}
