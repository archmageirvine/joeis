package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263944 Positive integers n such that (n+28)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263944() {
    super(1, new long[] {1, -6, 6}, new long[] {28, 189, 959});
  }
}
