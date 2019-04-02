package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257780 Positive integers whose square is the sum of 47 consecutive squares.
 * @author Sean A. Irvine
 */
public class A257780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257780() {
    super(new long[] {-1, 0, 96, 0}, new long[] {3854, 5170, 369890, 496226});
  }
}
