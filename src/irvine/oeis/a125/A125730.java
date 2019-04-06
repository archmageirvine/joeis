package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125730 Minimal number of initial pieces needed to reach level n in the Solitaire Army game when diagonal jumps are allowed.
 * @author Georg Fischer
 */
public class A125730 extends FiniteSequence {

  /** Construct the sequence. */
  public A125730() {
    super(1, 2, 3, 5, 8, 13, 23, 46, 123);
  }
}
