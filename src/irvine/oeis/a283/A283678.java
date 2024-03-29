package irvine.oeis.a283;
// Generated by gen_seq4.pl holos [[0],[2,-12,24,-16],[0,1]] [1,2,54] 0 at 2020-03-14 22:45
// Recurrence: n*a[n+0]-2*(2*n-1)^3*a[n-1]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A283678 Number of possible draws of 2n pairs of consecutive cards from a set of 4n + 1 cards, so that the card that initially occupies the central position is not selected.
 * @author Georg Fischer
 */
public class A283678 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A283678() {
    super(0, "[[0],[2,-12,24,-16],[0,1]]", "[1,2,54]", 0);
  }
}
