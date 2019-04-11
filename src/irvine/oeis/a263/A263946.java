package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263946 Positive integers n such that <code>(n+52)^3 - n^3</code> is a square.
 * @author Sean A. Irvine
 */
public class A263946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263946() {
    super(new long[] {1, -51, 51}, new long[] {26, 2626, 132522});
  }
}
