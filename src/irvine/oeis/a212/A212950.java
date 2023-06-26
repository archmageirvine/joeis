package irvine.oeis.a212;

import irvine.oeis.FiniteSequence;

/**
 * A212950 Amounts (in cents) of Canadian coins in denominations suggested by Shallit.
 * @author Georg Fischer
 */
public class A212950 extends FiniteSequence {

  /** Construct the sequence. */
  public A212950() {
    super(1, FINITE, 1, 5, 10, 25, 83, 100, 200);
  }
}
