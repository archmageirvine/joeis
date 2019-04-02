package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014225 Number of initial pieces needed to reach level n in the Solitaire Army game.
 * @author Sean A. Irvine
 */
public class A014225 extends FiniteSequence {

  /** Construct the sequence. */
  public A014225() {
    super(1, 2, 4, 8, 20);
  }
}
