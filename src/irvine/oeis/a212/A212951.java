package irvine.oeis.a212;

import irvine.oeis.FiniteSequence;

/**
 * A212951 Amounts (in hundredths of a Euro) of coins in denominations suggested by Shallit.
 * @author Georg Fischer
 */
public class A212951 extends FiniteSequence {

  /** Construct the sequence. */
  public A212951() {
    super(1, FINITE, 1, 2, 5, 10, 20, 50, 100, 133, 200);
  }
}
