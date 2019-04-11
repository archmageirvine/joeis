package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055100 In the game of backgammon, the number of blot hitting rolls when the blot is n points away, <code>n=1,2,...,24</code>.
 * @author Georg Fischer
 */
public class A055100 extends FiniteSequence {

  /** Construct the sequence. */
  public A055100() {
    super(11, 12, 14, 15, 15, 17, 6, 6, 5, 3, 2, 3, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1);
  }
}
