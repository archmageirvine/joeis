package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178804 When dealing cards into 3 piles <code>(Left</code>, Center, <code>Right)</code>, the number of cards in the n-th card's pile, if dealing in a pattern L, C, R, C, L, C, R, C, L, C, ... [as any thoughtful <code>six-year-old</code> will try to do when sharing a pile of candy among <code>3 people]</code>.
 * @author Sean A. Irvine
 */
public class A178804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178804() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
