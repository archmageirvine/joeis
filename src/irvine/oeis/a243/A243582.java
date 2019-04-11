package irvine.oeis.a243;

import irvine.oeis.FiniteSequence;

/**
 * A243582 Integers of the form <code>8k+7</code> (A004771) that cannot be written as sum of four distinct squares.
 * @author Georg Fischer
 */
public class A243582 extends FiniteSequence {

  /** Construct the sequence. */
  public A243582() {
    super(7, 15, 23, 31, 47, 55, 103);
  }
}
