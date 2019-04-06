package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306221 The number of points awarded for a route of length n in the board game "Ticket to Ride".
 * @author Georg Fischer
 */
public class A306221 extends FiniteSequence {

  /** Construct the sequence. */
  public A306221() {
    super(1, 2, 4, 7, 10, 15, 18, 21, 27);
  }
}
