package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178804 When dealing cards into 3 piles (Left, Center, Right), the number of cards in the n-th card's pile, if dealing in a pattern L, C, R, C, L, C, R, C, L, C, ... [as <code>any</code> thoughtful six-year-old will try to do when sharing a pile of candy among 3 people].
 * @author Sean A. Irvine
 */
public class A178804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178804() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
