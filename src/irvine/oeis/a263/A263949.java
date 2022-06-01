package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263949 Positive integers n such that (n+84)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263949() {
    super(new long[] {1, -1, -16, 16, 1}, new long[] {28, 476, 1106, 8218, 18256});
  }
}
