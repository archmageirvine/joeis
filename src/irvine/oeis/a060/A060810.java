package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060810 Numbers whose squares have their digits in strictly increasing order.
 * @author Georg Fischer
 */
public class A060810 extends FiniteSequence {

  /** Construct the sequence. */
  public A060810() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 7, 13, 16, 17, 37, 116, 117, 367);
  }
}
