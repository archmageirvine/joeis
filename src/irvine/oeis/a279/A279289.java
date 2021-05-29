package irvine.oeis.a279;
// manually 2021-05-29: terms <= 29
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A279289 Numbers n such that phi(n) &gt; tau(n).
 * @author Georg Fischer
 */
public class A279289 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A279289() {
    super(1, "[[0],[-11,-1],[10, 1]]", "5, 7, 9, 11, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 25, 26, 27, 28, 29, 31, 32", 0);
  }
}
