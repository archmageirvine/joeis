package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263942 Positive integers n such that (n+4)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263942() {
    super(new long[] {1, -5, 5}, new long[] {6, 28, 110});
  }
}
