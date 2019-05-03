package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014355 Chance of getting a pair <code>(2</code> to <code>aces), 2</code> jacks, 2 queens, 2 kings, 2 aces, 2 pair, 3 of a kind, straight, flush, full house in 5-card poker is 1 in <code>a(n)</code>, according to M. Barron.
 * @author Sean A. Irvine
 */
public class A014355 extends FiniteSequence {

  /** Construct the sequence. */
  public A014355() {
    super(2, 5, 6, 7, 9, 9, 35, 132, 270, 588);
  }
}

