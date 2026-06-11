package irvine.oeis.a395;

import irvine.oeis.ComplementSequence;
import irvine.oeis.UnionSequence;

/**
 * A395367 Walk along the hexagonal spiral, with its cells numbered starting at 0, as in A395362. Two players, Black and Red, take turns. When it is Black's turn, he places a knight at the smallest unoccupied cell not attacked by an existing Red knight, and when it is Red's turn, she places a knight at the smallest unoccupied cell not attacked by an existing Black knight. Sequence lists cells not occupied by knights of either color.
 * @author Sean A. Irvine
 */
public class A395367 extends ComplementSequence {

  /** Construct the sequence. */
  public A395367() {
    super(0, new UnionSequence(new A395365(), new A395366()));
  }
}
