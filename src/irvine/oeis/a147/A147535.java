package irvine.oeis.a147;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A147535 A counting vertex substitution vector matrix Markov 3x3 with characteristic polynomial:24 - 26 x + 9 x^2 - x^3
 * @author Georg Fischer
 */
public class A147535 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A147535() {
    super(0, "[[0],[24],[-26],[9],[-1]]", "5, 18, 64", 0);
  }
}
