package irvine.oeis.a120;

import irvine.oeis.FiniteSequence;

/**
 * A120422 One winning solution (out of <code>6816)</code> in 15-hole triangular peg solitaire that leaves a peg in the original empty hole (apex).
 * @author Georg Fischer
 */
public class A120422 extends FiniteSequence {

  /** Construct the sequence. */
  public A120422() {
    super(4, 1, 6, 4, 15, 6, 3, 10, 13, 6, 11, 13, 14, 12, 12, 5, 10, 3, 7, 2, 1, 4, 4, 6, 6, 1);
  }
}
